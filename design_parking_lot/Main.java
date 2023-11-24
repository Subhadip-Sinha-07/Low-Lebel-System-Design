package design_parking_lot;

public class Main {
	public static void main(String[] args) throws Exception {

		FourWheelerParkingSpotManager fwinstance = FourWheelerParkingSpotManager.getFWInstance();
		fwinstance.addParkingSpot(new FourWheelerParkingSpot(1, true));
		fwinstance.addParkingSpot(new FourWheelerParkingSpot(3, true));

		TwoWheelerParkingSpotManager twinstance = TwoWheelerParkingSpotManager.getTMInstance();

		twinstance.addParkingSpot(new TwoWheelerParkingSpot(1, true));
		twinstance.addParkingSpot(new TwoWheelerParkingSpot(2, true));

		EntranceGate entryGate = new EntranceGate(3);

		Vehicle vehicle = new Vehicle();
		vehicle.setId(1);
		vehicle.setVehicleNo("WB0098PJ");
		vehicle.setType(VehicleType.FOURWHEELER);

		entryGate.createTicket(vehicle);

		ExitGateMgr exitGateMgr = ExitGateMgr.getExitGateInstance();

		ExitGate exitgate = new ExitGate(3);

		Ticket ticket = exitGateMgr.getTicket("WB0098PJ");

		int price = exitGateMgr.calculatePrice(ticket, exitgate);

		exitGateMgr.freeFourWheelerSpot(ticket, vehicle);

		System.out.println(price);

	}
}
