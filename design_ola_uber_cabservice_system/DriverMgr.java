package design_ola_uber_cabservice_system;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DriverMgr {

	public static DriverMgr driverMgr = null;

	public static ReentrantLock lock = new ReentrantLock();

	public static Map<Integer, Driver> mapOfDriver = new HashMap<>();

	private DriverMgr() {

	}

	public static DriverMgr getDriverMgr() {
		if (driverMgr == null) {
			lock.lock();
			if (driverMgr == null) {
				driverMgr = new DriverMgr();
			}
			lock.unlock();
		}
		return driverMgr;
	}

	public void addDriver(Driver driver) {
		mapOfDriver.put(driver.getId(), driver);
	}

	public Driver gerDriver(int id) {
		return mapOfDriver.get(id);
	}
}