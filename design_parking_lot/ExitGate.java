package design_parking_lot;

public class ExitGate {

	int exitGateNo;

	public ExitGate(int exitGateNo) {
		this.exitGateNo = exitGateNo;
	}

	public int calculatePrice(Ticket ticket, ParkingSlotPricingStrategy strategy) {
		return strategy.getPrice(ticket.getVehicle());
	}

	public void freeTwoWheelerParkingSpot(TwoWheelerParkingSpotManager tm, ParkingSpot ps, Vehicle vehicle) {
		tm.removeVehicle(vehicle, ps);
	}

	public void freeFourWheelerParkingSpot(FourWheelerParkingSpot fm, ParkingSpot ps, Vehicle vehicle) {
		fm.freeParkingSpot(vehicle, ps);
	}
}
