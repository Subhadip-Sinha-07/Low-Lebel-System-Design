package design_parking_lot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class FourWheelerParkingSpotManager {

	public static FourWheelerParkingSpotManager fwinstance = null;

	public static ReentrantLock lock = new ReentrantLock();

	List<ParkingSpot> getListOfFourWheelerParkinglist = new ArrayList<>();

	private FourWheelerParkingSpotManager() {

	}

	public static FourWheelerParkingSpotManager getFWInstance() {
		if (fwinstance == null) {
			lock.lock();
			if (fwinstance == null) {
				fwinstance = new FourWheelerParkingSpotManager();
			}
			lock.unlock();
		}
		return fwinstance;
	}

	public List<ParkingSpot> getListOfparkingSpot() {
		return getListOfFourWheelerParkinglist;
	}

	public ParkingSpot getAvailableParkingSpot() throws Exception {
		for (ParkingSpot parking : getListOfFourWheelerParkinglist) {
			if (parking.isavailable) {
				return parking;
			}
		}
		throw new Exception("Parking is not available");
	}

	public void addParkingSpot(ParkingSpot parkingspot) {
		getListOfFourWheelerParkinglist.add(parkingspot);
	}

	public void removeParkingSpot(ParkingSpot parkingspot) {
		getListOfFourWheelerParkinglist.remove(parkingspot);
	}

	public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
		parkingSpot.parkVehicle(vehicle, parkingSpot);
	}

	public void removeVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
		parkingSpot.freeParkingSpot(vehicle, parkingSpot);
	}
}