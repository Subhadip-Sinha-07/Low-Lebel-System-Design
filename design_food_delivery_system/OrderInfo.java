package design_food_delivery_system;

import java.util.List;

public class OrderInfo {

	private OrderStatus status;

	private int orderId;

	private int restaurentId;

	private List<Dish> listOfDishes;

	private int userId;

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
	}

	public List<Dish> getListOfDishes() {
		return listOfDishes;
	}

	public void setListOfDishes(List<Dish> listOfDishes) {
		this.listOfDishes = listOfDishes;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}