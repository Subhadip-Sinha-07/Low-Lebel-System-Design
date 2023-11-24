package design_parking_lot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class TwoWheelerParkingSpotManager {

	public static TwoWheelerParkingSpotManager twinstance = null;

	public static ReentrantLock lock = new ReentrantLock();

	List<ParkingSpot> getListOfTwoWheelerParkinglist = new ArrayList<>();

	private TwoWheelerParkingSpotManager() {

	}

	public static TwoWheelerParkingSpotManager getTMInstance() {
		if (twinstance == null) {
			lock.lock();
			if (twinstance == null) {
				twinstance = new TwoWheelerParkingSpotManager();
			}
			lock.unlock();
		}
		return twinstance;
	}

	public List<ParkingSpot> getListOfparkingSpot() {
		return getListOfTwoWheelerParkinglist;
	}

	public ParkingSpot getAvailableParkingSpot() throws Exception {
		for (ParkingSpot parking : getListOfTwoWheelerParkinglist) {
			if (parking.isavailable) {
				return parking;
			}
		}
		throw new Exception("Parking is not available");
	}

	public void addParkingSpot(ParkingSpot parkingspot) {
		getListOfTwoWheelerParkinglist.add(parkingspot);
	}

	public void removeParkingSpot(ParkingSpot parkingspot) {
		getListOfTwoWheelerParkinglist.remove(parkingspot);

	}

	public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
		parkingSpot.parkVehicle(vehicle, parkingSpot);
	}

	public void removeVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
		parkingSpot.freeParkingSpot(vehicle, parkingSpot);
	}
}
