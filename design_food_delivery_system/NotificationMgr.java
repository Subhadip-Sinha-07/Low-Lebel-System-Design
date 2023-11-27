package design_food_delivery_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class NotificationMgr {

	private static NotificationMgr notificationMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	Map<Integer, List<INotificationService>> observer = new HashMap<>();

	public static NotificationMgr getNotificationMgr() {
		if (notificationMgr == null) {
			lock.lock();
			if (notificationMgr == null) {
				notificationMgr = new NotificationMgr();
			}
			lock.unlock();
		}
		return notificationMgr;
	}

	public void attachObserver(int userId, List<INotificationService> notificationServices) {
		observer.put(userId, notificationServices);
	}

	public void detachObserver(int userId) {
		observer.remove(userId);
	}

	public void notifyAnUser(int userId, String message, int orderId) {
		List<INotificationService> getNotifications = observer.get(userId);
		for (INotificationService notificationService : getNotifications) {
			notificationService.sendNotification(userId, orderId, message);
		}
	}
}