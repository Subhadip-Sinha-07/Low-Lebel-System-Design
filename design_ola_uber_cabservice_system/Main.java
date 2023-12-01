package design_ola_uber_cabservice_system;

public class Main {

	public static void main(String[] args) {
		RiderMgr riderMgr = RiderMgr.getRiderMgr();
		Rider rider1 = new Rider();
		rider1.setId(2);
		rider1.setName("sanu");
		rider1.setRating("GOOD");

		Rider rider2 = new Rider();
		rider2.setId(2);
		rider2.setName("suman");
		rider2.setRating("BAD");

		riderMgr.addRider(rider1);
		riderMgr.addRider(rider2);

		DriverMgr driverMgr = DriverMgr.getDriverMgr();

		Driver driver1 = new Driver();
		driver1.setId(2);
		driver1.setName("Sambhu");
		driver1.setVehicle(new Sedan("no1", "WB9808J90"));

		Driver driver2 = new Driver();
		driver2.setId(4);
		driver2.setName("Chandan");
		driver2.setVehicle(new HatchBack("no2", "KA9808J90"));

		driverMgr.addDriver(driver1);
		driverMgr.addDriver(driver2);

		TripMgr tripMgr = TripMgr.getTripMgr();
		tripMgr.createTrip(rider1, "Bengalore", "Kolkata", new RatingBasedPricingStrategy(),
				new LeastTimeBasedMatchingStrategy());

	}
}