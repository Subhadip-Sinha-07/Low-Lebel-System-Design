package design_ola_uber_cabservice_system;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy {

	@Override
	public Driver matchDriver(TripMetaData tripMetaData) {
		DriverMgr driverMgr = DriverMgr.getDriverMgr();
		Driver driver = driverMgr.gerDriver(2);
		// TODO Auto-generated method stub
		return driver;
	}
}