package design_vending_machine;

import java.util.List;

public class DispenseState implements IState {

	@Override
	public void insertCoin(VendingMachine vendingMachine, int coin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setectProduct(VendingMachine vendingMachine, int selno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int selno) throws Exception {
		Item item = vendingMachine.getInventoryMgr().getItem(selno);
		System.out.println(item.typeItemtype);
		System.out.println(item.price);
		return item;
	}

	@Override
	public int getChange(VendingMachine vendingMachine, List<Integer> extracoin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateInvertory(VendingMachine vendingMachine, Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Coin> getTotalReturn(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		return null;
	}

}
