package design_food_delivery_system;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		NotificationMgr nm = NotificationMgr.getNotificationMgr();

		DishAddOn dishAddon = new DishAddOn();
		dishAddon.setId(1);
		dishAddon.setName("name");
		Dish dish = new Dish();
		dish.setName("Chicken curry");
		dish.setListOfAddon(Arrays.asList(dishAddon));
		Menu menu = new Menu();
		menu.setListOfDishes(Arrays.asList(dish));
		Restaurent restaurent = new Restaurent(2, "Bypass Dhaba", true, menu);
		RestaurentMgr restaurentMgr = RestaurentMgr.getRestaurentMgr();
		restaurentMgr.addRestaurent(restaurent);

		User user = new User();
		user.setUserId(2);
		user.setLocation("Henria");
		user.setUsername("sunny");

		DeliveryPartner dp = new DeliveryPartner();
		dp.setId(2);
		dp.setRating(Rating.BEST);
		dp.setName("Sudip");
		dp.setStatus(DriverStatus.IDLE);

		DeliveryPartnerMgr dpm = DeliveryPartnerMgr.getDeliveryParMgr();

		dpm.addDeliveryPartner(dp);

		DeliveryMgr dm = DeliveryMgr.getDeliveryMgr();

		dm.setStrategyToSelectDeliveryPartners(new LocBasedDeliveryPartnerMatchingStrategy());

		OrderMagr odeMagr = OrderMagr.getOrderMgr();

		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setListOfDishes(Arrays.asList(dish));
		orderInfo.setRestaurentId(2);
		orderInfo.setUserId(2);
		orderInfo.setOrderId(2);
		orderInfo.setStatus(OrderStatus.PLACED);

		nm.attachObserver(user.getUserId(), Arrays.asList(new SMSNotificationService()));

		odeMagr.createOrder(orderInfo);
	}
}