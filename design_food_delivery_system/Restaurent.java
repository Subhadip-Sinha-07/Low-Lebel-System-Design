package design_food_delivery_system;

import java.util.List;

public class Restaurent {

	private String location;

	private int restaurentId;

	private String name;

	private boolean isAvailable;

	private Menu menu;

	public Restaurent(int restaurentId, String name, boolean isAvailable, Menu menu) {
		super();
		this.restaurentId = restaurentId;
		this.name = name;
		this.isAvailable = isAvailable;
		this.menu = menu;
	}

	public int getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void prepareFood(int userId, List<Dish> dishes, int orderId) {

	}
}