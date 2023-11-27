package design_food_delivery_system;

import java.util.List;

public class Menu {

	private int id;

	private boolean isAvailable;

	private MenuType menuType;

	private String descriptions;

	private List<Dish> listOfDishes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public MenuType getMenuType() {
		return menuType;
	}

	public void setMenuType(MenuType menuType) {
		this.menuType = menuType;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public List<Dish> getListOfDishes() {
		return listOfDishes;
	}

	public void setListOfDishes(List<Dish> listOfDishes) {
		this.listOfDishes = listOfDishes;
	}
}