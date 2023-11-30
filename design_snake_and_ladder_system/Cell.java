package design_snake_and_ladder_system;

public class Cell {
	
	private int id;
	
	private Item item;
	
	private int cellNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getCellNo() {
		return cellNo;
	}

	public void setCellNo(int cellNo) {
		this.cellNo = cellNo;
	}	
}