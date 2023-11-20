package design_vending_machine;

public class Item {

	Itemtype typeItemtype;
	int itemcode;
	int price;
	int extraamount;

	public Itemtype getTypeItemtype() {
		return typeItemtype;
	}

	public void setTypeItemtype(Itemtype typeItemtype) {
		this.typeItemtype = typeItemtype;
	}

	public int getItemcode() {
		return itemcode;
	}

	public int getExtraamount() {
		return extraamount;
	}

	public void setExtraamount(int extraamount) {
		this.extraamount = extraamount;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}