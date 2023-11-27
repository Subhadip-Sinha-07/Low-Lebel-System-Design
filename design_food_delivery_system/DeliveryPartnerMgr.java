package design_food_delivery_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DeliveryPartnerMgr {

	private static NotificationMgr notificationMgr = NotificationMgr.getNotificationMgr();

	private static DeliveryPartnerMgr deliveryPartnerMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	Map<Integer, DeliveryPartner> mapOfDeliveryPartner = new HashMap<>();

	public static DeliveryPartnerMgr getDeliveryParMgr() {
		if (deliveryPartnerMgr == null) {
			lock.lock();
			if (deliveryPartnerMgr == null) {
				deliveryPartnerMgr = new DeliveryPartnerMgr();
			}
			lock.unlock();
		}
		return deliveryPartnerMgr;
	}

	public void addDeliveryPartner(DeliveryPartner deliveryPartner) {
		mapOfDeliveryPartner.put(deliveryPartner.getId(), deliveryPartner);
	}

	public void removeDeliveryPartner(DeliveryPartner deliveryPartner) {
		mapOfDeliveryPartner.remove(deliveryPartner.getId());
	}

	public List<DeliveryPartner> getListOfAvailableDP() {
		List<DeliveryPartner> result = new ArrayList<>();
		for (Integer key : mapOfDeliveryPartner.keySet()) {
			if (mapOfDeliveryPartner.get(key).getStatus().equals(DriverStatus.IDLE)) {
				result.add(mapOfDeliveryPartner.get(key));
			}
		}
		return result;
	}

	public void performDelivery(int deliveryPartnerId, int userId, int orderId) {
		notificationMgr.notifyAnUser(userId,
				"Deliver Partner Assigned" + mapOfDeliveryPartner.get(deliveryPartnerId).getName(), orderId);
		DeliveryPartner dp = mapOfDeliveryPartner.get(deliveryPartnerId);
		dp.setStatus(DriverStatus.DELIEVERING);
		mapOfDeliveryPartner.put(deliveryPartnerId, dp);
		notificationMgr.notifyAnUser(userId, "Deliverered by " + mapOfDeliveryPartner.get(deliveryPartnerId).getName(),
				orderId);
		dp.setStatus(DriverStatus.IDLE);
	}
}