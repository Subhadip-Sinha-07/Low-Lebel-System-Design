package design_vending_machine;

import java.util.List;

public interface IState {

	void insertCoin(VendingMachine vendingMachine, int coin) throws Exception;

	void setectProduct(VendingMachine vendingMachine, int selno) throws Exception;

	Item dispenseProduct(VendingMachine vendingMachine, int selno) throws Exception;

	int getChange(VendingMachine vendingMachine,List<Integer> extracoin) throws Exception;

	void updateInvertory(VendingMachine vendingMachine, Item item) throws Exception;

	List<Coin> getTotalReturn(VendingMachine vendingMachine) throws Exception;
}