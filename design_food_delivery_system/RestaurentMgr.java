package design_food_delivery_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class RestaurentMgr {

	private static OrderMagr orderMagr = OrderMagr.getOrderMgr();

	private static NotificationMgr notificationMgr = NotificationMgr.getNotificationMgr();

	private static RestaurentMgr restaurentMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	private static Map<Integer, Restaurent> mapOfRestaurent = new HashMap<>();

	private RestaurentMgr() {

	}

	public static RestaurentMgr getRestaurentMgr() {
		if (restaurentMgr == null) {
//			lock.lock();
			if (restaurentMgr == null) {
				restaurentMgr = new RestaurentMgr();
			}
//			lock.unlock();
		}
		return restaurentMgr;
	}

	public void addRestaurent(Restaurent restaurent) {
		mapOfRestaurent.put(restaurent.getRestaurentId(), restaurent);
	}

	public void removeRestaurent(Restaurent restaurent) {
		mapOfRestaurent.remove(restaurent.getRestaurentId());
	}

	public void orderFoodForRestaurent(int userId, int orderId, int restaurentId, List<Dish> listOfDish) {
		notificationMgr.notifyAnUser(userId, "Restaurent Accepted the order", orderId);
		prepareFood(userId, restaurentId, orderId, listOfDish);
		OrderInfo orderInfo = orderMagr.getOrderInfo(orderId);
		orderInfo.setStatus(OrderStatus.COOKED);
		orderMagr.updateOrder(orderId, orderInfo);
		return;
	}

	private void prepareFood(int userId, int restaurentId, int orderId, List<Dish> listOfDish) {
		Restaurent restaurent = mapOfRestaurent.get(restaurentId);
		restaurent.prepareFood(userId, listOfDish, orderId);
	}
}