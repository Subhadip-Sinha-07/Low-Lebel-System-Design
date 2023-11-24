package design_parking_lot;

public class HourlyPricingStrategy implements ParkingSlotPricingStrategy {

	@Override
	public int getPrice(Vehicle vehicle) {
		if (vehicle.getType().equals(VehicleType.TWOWHEELER)) {
			return 50;
		}
		return 80;
	}
}
