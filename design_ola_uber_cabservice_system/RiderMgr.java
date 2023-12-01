package design_ola_uber_cabservice_system;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class RiderMgr {

	public static RiderMgr riderMgr = null;

	public static ReentrantLock lock = new ReentrantLock();

	public static Map<Integer, Rider> mapOfRiders = new HashMap<>();

	private RiderMgr() {

	}

	public static RiderMgr getRiderMgr() {
		if (riderMgr == null) {
			lock.lock();
			if (riderMgr == null) {
				riderMgr = new RiderMgr();
			}
			lock.unlock();
		}
		return riderMgr;
	}

	public void addRider(Rider rider) {
		mapOfRiders.put(rider.getId(), rider);
	}

	public Rider getRiderInfo(int id) {
		return mapOfRiders.get(id);
	}
}
