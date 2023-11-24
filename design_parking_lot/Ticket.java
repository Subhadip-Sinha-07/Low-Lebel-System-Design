package design_parking_lot;

import java.time.LocalDateTime;

public class Ticket {

	int id;

	Vehicle vehicle;

	LocalDateTime entrytime;
	
	ParkingSpot parkingSpot;

	public int getId() {
		return id;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(LocalDateTime entrytime) {
		this.entrytime = entrytime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}