package design_food_delivery_system;

import java.util.List;

public class Dish {

	private int id;

	private String name;

	private int price;

	private boolean isAvailable;

	private String description;

	private List<DishAddOn> listOfAddon;

	private List<String> images;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<DishAddOn> getListOfAddon() {
		return listOfAddon;
	}

	public void setListOfAddon(List<DishAddOn> listOfAddon) {
		this.listOfAddon = listOfAddon;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
}
