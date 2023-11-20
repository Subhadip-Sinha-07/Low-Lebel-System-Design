package design_vending_machine;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InventoryMgr {

	public static InventoryMgr InventoryMgrIns = null;

	public static Lock lock = new ReentrantLock();

	ItemShelf[] shelf;

	private InventoryMgr() {
	}

	// This is double check locking for multithreading context
	public static InventoryMgr getInvertoryMgrInstance() {
		if (InventoryMgrIns == null) {
			lock.lock();
			if (InventoryMgrIns == null) {
				InventoryMgrIns = new InventoryMgr();
			}
			lock.unlock();
		}
		return InventoryMgrIns;
	}

	public void setItemshelf(int size) {
		shelf = new ItemShelf[size];
	}

	public void fillAllInterteryShelf() throws Exception {
		for (int i = 0; i < shelf.length; i++) {
			if (i >= 0 && i < 3) {
				Item item = new Item();
				item.setTypeItemtype(Itemtype.Coke);
				item.setPrice(100);
				item.setItemcode(i);
				addItem(item, i);
			} else if (i >= 3 && i < 6) {
				Item item = new Item();
				item.setTypeItemtype(Itemtype.Juice);
				item.setPrice(150);
				item.setItemcode(i);
				addItem(item, i);
			} else {
				Item item = new Item();
				item.setTypeItemtype(Itemtype.Snacks);
				item.setPrice(50);
				item.setItemcode(i);
				addItem(item, i);
			}
		}
	}

	public Item getItem(int selno) throws Exception {
		if (shelf[selno] == null || selno < 0 || selno >= shelf.length) {
			throw new Exception("Item is not available");
		}
		return shelf[selno].getItem();
	}

	public void addItem(Item item, int selno) throws Exception {
		if (selno >= shelf.length || selno < 0) {
			throw new Exception("Sel No Is Invalid");
		}
		if (shelf[selno] != null) {
			throw new Exception("Shelf is occupied");
		}
		ItemShelf itemself = new ItemShelf();
		itemself.setItem(item);
		itemself.setSelnumber(selno);
		itemself.setAvailable(true);
		shelf[selno] = itemself;
	}

	public List<ItemShelf> getListOfAvailableShelf() {
		List<ItemShelf> availableShelf = new ArrayList<ItemShelf>();
		for (ItemShelf item : shelf) {
			if (!item.isAvailable) {
				availableShelf.add(item);
			}
		}
		return availableShelf;
	}

}
