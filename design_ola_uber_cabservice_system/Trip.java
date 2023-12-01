package design_ola_uber_cabservice_system;

public class Trip {

	private int tripId;

	private Rider rider;

	private Driver driver;

	private String srcLoc;

	private String destLoc;

	private PricingStrategy pricingStrategy;

	private DriverMatchingStrategy driverMatchingStrategy;

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getSrcLoc() {
		return srcLoc;
	}

	public void setSrcLoc(String srcLoc) {
		this.srcLoc = srcLoc;
	}

	public String getDestLoc() {
		return destLoc;
	}

	public void setDestLoc(String destLoc) {
		this.destLoc = destLoc;
	}

	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

	public DriverMatchingStrategy getDriverMatchingStrategy() {
		return driverMatchingStrategy;
	}

	public void setDriverMatchingStrategy(DriverMatchingStrategy driverMatchingStrategy) {
		this.driverMatchingStrategy = driverMatchingStrategy;
	}
}