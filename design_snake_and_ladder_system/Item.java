package design_snake_and_ladder_system;

public class Item {

	private int start;

	private int end;

	private CellType celltype;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public CellType getCelltype() {
		return celltype;
	}

	public void setCelltype(CellType celltype) {
		this.celltype = celltype;
	}
}