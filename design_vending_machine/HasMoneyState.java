package design_vending_machine;

import java.util.List;

public class HasMoneyState implements IState {

	@Override
	public void insertCoin(VendingMachine vendingMachine, int coin) {
		vendingMachine.getList().add(coin);
		vendingMachine.setState(new SelectionState());
		return;
	}

	@Override
	public void setectProduct(VendingMachine vendingMachine, int selno) throws Exception {
		throw new Exception("Invalid Input");
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int selno) throws Exception {
		throw new Exception("Invalid Input");
	}

	@Override
	public int getChange(VendingMachine vendingMachine,List<Integer> extracoin) throws Exception {
		throw new Exception("Invalid Input");
	}

	@Override
	public void updateInvertory(VendingMachine vendingMachine, Item item) throws Exception {
		throw new Exception("Invalid Input");
	}

	@Override
	public List<Coin> getTotalReturn(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Invalid Input");
	}
}