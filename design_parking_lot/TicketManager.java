package design_parking_lot;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class TicketManager {

	public static TicketManager ticketmanager = null;
	public static ReentrantLock lock = new ReentrantLock();

	Map<String, Ticket> mapoftickets = new HashMap<>();

	private TicketManager() {

	}

	public static TicketManager getTicketMgrInstance() {
		if (ticketmanager == null) {
			lock.lock();
			if (ticketmanager == null) {
				ticketmanager = new TicketManager();
			}
			lock.unlock();
		}
		return ticketmanager;
	}

	public void createTicket(Vehicle vehicle, ParkingSpot ps) {
		Ticket ticket = new Ticket();
		ticket.setEntrytime(LocalDateTime.now());
		ticket.setId(2);
		ticket.setVehicle(vehicle);
		ticket.setParkingSpot(ps);
		mapoftickets.put(vehicle.getVehicleNo(), ticket);
	}

	public Ticket getTicketInfo(String vehicleNo) {
		return mapoftickets.get(vehicleNo);
	}
}
