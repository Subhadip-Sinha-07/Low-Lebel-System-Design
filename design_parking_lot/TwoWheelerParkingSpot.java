package design_parking_lot;

public class TwoWheelerParkingSpot extends ParkingSpot {

	public TwoWheelerParkingSpot(int id, boolean isavailable) {
		super();
	}

	@Override
	public void parkVehicle(Vehicle vehicle, ParkingSpot ps) {
		ps.vehicle = vehicle;
		ps.isavailable = false;
	}

	@Override
	public void freeParkingSpot(Vehicle vehicle, ParkingSpot ps) {
		ps.vehicle = null;
		ps.isavailable = true;
	}

	@Override
	public int getPrice() {
		
		return 0;
	}
}