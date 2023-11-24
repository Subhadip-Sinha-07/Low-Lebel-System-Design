package design_parking_lot;

public class FourWheelerParkingSpot extends ParkingSpot {

	public FourWheelerParkingSpot(int id, boolean isavailable) {
		super.isavailable = isavailable;
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
		// TODO Auto-generated method stub
		return 0;
	}

}