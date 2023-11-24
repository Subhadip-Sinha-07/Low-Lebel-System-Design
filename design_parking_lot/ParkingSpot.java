package design_parking_lot;

public abstract class ParkingSpot {

	int id;

	Vehicle vehicle;

	boolean isavailable;
	
	public abstract int getPrice();

	public abstract void parkVehicle(Vehicle vehicle, ParkingSpot ps);

	public abstract void freeParkingSpot(Vehicle vehicle, ParkingSpot ps);
}