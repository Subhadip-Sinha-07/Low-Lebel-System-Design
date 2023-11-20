package design_vending_machine;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		InventoryMgr mgr = InventoryMgr.getInvertoryMgrInstance();
		mgr.setItemshelf(9);
		mgr.fillAllInterteryShelf();
		VendingMachine vm = new VendingMachine();
		vm.setList(new ArrayList<Integer>());
		vm.setInventoryMgr(mgr);
		vm.setState(new IdleState());
		vm.getState().insertCoin(vm, 99);
		vm.getState().insertCoin(vm, 100);
		vm.getState().setectProduct(vm, 2);
		vm.getState().dispenseProduct(vm, 2);
	}
}