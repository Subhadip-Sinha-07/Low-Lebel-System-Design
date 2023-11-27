package design_food_delivery_system;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class OrderMagr {

	private static DeliveryMgr dm = DeliveryMgr.getDeliveryMgr();

	private static NotificationMgr notificationMgr = NotificationMgr.getNotificationMgr();

	private static RestaurentMgr restaurentMgr = RestaurentMgr.getRestaurentMgr();

	private static OrderMagr orderMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	private static Map<Integer, OrderInfo> mapOfOrder = new HashMap<>();

	public static OrderMagr getOrderMgr() {
		if (orderMgr == null) {
//			lock.lock();
			if (orderMgr == null) {
				orderMgr = new OrderMagr();
			}
//			lock.unlock();
		}
		return orderMgr;
	}

	public void createOrder(OrderInfo oredrInfo) {
		notificationMgr.notifyAnUser(oredrInfo.getUserId(), "Order is Placed", oredrInfo.getOrderId());
		oredrInfo.setStatus(OrderStatus.PLACED);
		mapOfOrder.put(oredrInfo.getOrderId(), oredrInfo);
		System.out.println(oredrInfo.getRestaurentId());
		restaurentMgr.orderFoodForRestaurent(oredrInfo.getUserId(), oredrInfo.getOrderId(), oredrInfo.getRestaurentId(),
				oredrInfo.getListOfDishes());
		DeliveryPartner deliveryPartner = dm.getDeliveryPartner();
		dm.performDelivery(deliveryPartner.getId(), oredrInfo.getUserId(), oredrInfo.getOrderId());
	}

	public void updateOrder(int orderId, OrderInfo oredrInfo) {
		mapOfOrder.put(null, oredrInfo);
	}

	public OrderInfo getOrderInfo(int orderId) {
		return mapOfOrder.get(orderId);
	}
}