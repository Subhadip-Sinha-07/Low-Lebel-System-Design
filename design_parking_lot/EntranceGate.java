package design_parking_lot;

public class EntranceGate {

	int gateno;

	TicketManager ticketMgr = null;

	TwoWheelerParkingSpotManager tm = null;

	FourWheelerParkingSpotManager fm = null;

	public EntranceGate(int gateno) {
		this.gateno = gateno;
		ticketMgr = TicketManager.getTicketMgrInstance();
		tm = TwoWheelerParkingSpotManager.getTMInstance();
		fm = FourWheelerParkingSpotManager.getFWInstance();
	}

	public void createTicket(Vehicle vehicle) throws Exception {
		ParkingSpot ps = parkVehicle(vehicle);
		ticketMgr.createTicket(vehicle, ps);
	}

	public ParkingSpot parkVehicle(Vehicle vehicle) throws Exception {
		ParkingSpot ps = null;
		if (vehicle.getType() == VehicleType.TWOWHEELER) {
			ps = tm.getAvailableParkingSpot();
			ps.parkVehicle(vehicle, ps);
			return ps;
		}
		ps = fm.getAvailableParkingSpot();
		ps.parkVehicle(vehicle, ps);
		return ps;
	}
}