package design_ola_uber_cabservice_system;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class TripMgr {

	public static TripMgr tripMgr = null;

	public static ReentrantLock lock = new ReentrantLock();

	public static Map<Integer, Trip> mapOfRiders = new HashMap<>();

	private TripMgr() {

	}

	public static TripMgr getTripMgr() {
		if (tripMgr == null) {
			lock.lock();
			if (tripMgr == null) {
				tripMgr = new TripMgr();
			}
			lock.unlock();
		}
		return tripMgr;
	}

	public void createTrip(Rider rider, String srcLoc, String destLoc, PricingStrategy pricingStrategy,
			DriverMatchingStrategy driverMatchingStrategy) {
		TripMetaData tripMetaData = new TripMetaData();
		tripMetaData.setRating(rider.getRating());
		Driver driver = driverMatchingStrategy.matchDriver(tripMetaData);
		Trip trip = new Trip();
		trip.setSrcLoc(srcLoc);
		trip.setDestLoc(destLoc);
		trip.setDriver(driver);
		trip.setRider(rider);
		trip.setPricingStrategy(pricingStrategy);
		System.out.println("Trip Started with driver" + driver.getName());
	}
}