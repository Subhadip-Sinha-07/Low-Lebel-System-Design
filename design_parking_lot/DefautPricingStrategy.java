package design_parking_lot;

public class DefautPricingStrategy implements ParkingSlotPricingStrategy {

	@Override
	public int getPrice(Vehicle vehicle) {
		if (vehicle.getType().equals(VehicleType.TWOWHEELER)) {
			return 30;
		}
		return 50;
	}
}
