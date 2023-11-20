package design_vending_machine;

import java.util.List;

public class VendingMachine {
  
	
	List<Integer> list;
	IState state;
	InventoryMgr inventoryMgr;
	
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public IState getState() {
		return state;
	}
	public void setState(IState state) {
		this.state = state;
	}
	public InventoryMgr getInventoryMgr() {
		return inventoryMgr;
	}
	public void setInventoryMgr(InventoryMgr inventoryMgr) {
		this.inventoryMgr = inventoryMgr;
	}
}