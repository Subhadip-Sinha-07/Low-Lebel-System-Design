package design_vending_machine;

public class ItemShelf {

	Item item;
	int selnumber;
	boolean isAvailable;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getSelnumber() {
		return selnumber;
	}

	public void setSelnumber(int selnumber) {
		this.selnumber = selnumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}