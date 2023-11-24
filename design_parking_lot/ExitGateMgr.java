package design_parking_lot;

import java.util.concurrent.locks.ReentrantLock;

public class ExitGateMgr {

	public static ExitGateMgr exitgateMgr = null;

	public static ReentrantLock lock = new ReentrantLock();

	TicketManager ticketMgr = TicketManager.getTicketMgrInstance();

	TwoWheelerParkingSpotManager tm = TwoWheelerParkingSpotManager.getTMInstance();

	FourWheelerParkingSpotManager fm = FourWheelerParkingSpotManager.getFWInstance();

	private ExitGateMgr() {

	}

	public static ExitGateMgr getExitGateInstance() {
		if (exitgateMgr == null) {
			lock.lock();
			if (exitgateMgr == null) {
				exitgateMgr = new ExitGateMgr();
			}
			lock.unlock();
		}
		return exitgateMgr;
	}

	public Ticket getTicket(String number) {
		return ticketMgr.getTicketInfo(number);
	}

	public int calculatePrice(Ticket ticket, ExitGate exitgate) {
		return exitgate.calculatePrice(ticket, new HourlyPricingStrategy());
	}

	public void freeTwoWheelerSpot(Ticket ticket, Vehicle vehicle) {
		tm.removeVehicle(vehicle, ticket.getParkingSpot());
	}

	public void freeFourWheelerSpot(Ticket ticket, Vehicle vehicle) {
		fm.removeVehicle(vehicle, ticket.getParkingSpot());
	}
}
