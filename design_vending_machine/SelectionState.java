package design_vending_machine;

import java.util.ArrayList;
import java.util.List;

public class SelectionState implements IState {

	@Override
	public void insertCoin(VendingMachine vendingMachine, int coin) {
		vendingMachine.getList().add(coin);
		return;
	}

	@Override
	public void setectProduct(VendingMachine vendingMachine, int selno) throws Exception {
		List<Integer> getTotalCoin = vendingMachine.getList();
		List<Integer> extracoin = new ArrayList<Integer>();
		int count = 0;
		for (Integer coin : getTotalCoin) {
			count += coin;
		}
		if (count < vendingMachine.getInventoryMgr().getItem(selno).getPrice()) {
			throw new Exception("Insufficient Coin");
		} else {
			InventoryMgr mgr = vendingMachine.getInventoryMgr();
			Item item = mgr.getItem(selno);
			item.setExtraamount(count - vendingMachine.getInventoryMgr().getItem(selno).getPrice());
			extracoin.add(count - vendingMachine.getInventoryMgr().getItem(selno).getPrice());
		}
		getChange(vendingMachine, extracoin);
		vendingMachine.setState(new DispenseState());
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int selno) throws Exception {
		throw new Exception("Invalid input");
	}

	@Override
	public int getChange(VendingMachine vendingMachine, List<Integer> extracoin) {
		int extramoney = 0;
		for (Integer extra : extracoin) {
			extramoney += extra;
		}
		System.out.println("you have an extra money of " + extramoney);
		return extramoney;
	}

	@Override
	public void updateInvertory(VendingMachine vendingMachine, Item item) throws Exception {
		throw new Exception("Invalid input");
	}

	@Override
	public List<Coin> getTotalReturn(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		return null;
	}

}
