package design_snake_and_ladder_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class DiceMgr {

	private static DiceMgr diceMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	private static List<Dice> list = new ArrayList<>();

	public static DiceMgr getDiceManager() {
		if (diceMgr == null) {
			lock.lock();
			if (diceMgr == null) {
				diceMgr = new DiceMgr();
			}
			lock.unlock();
		}
		return diceMgr;
	}

	public void addDice(int noOfDice) {
		while (noOfDice > 0) {
			list.add(new Dice(new Random().nextInt()));
			noOfDice--;
		}
	}

	public int rollDice() {
		int sum = 0;
		for (Dice dice : list) {
			sum += dice.rollDice();
		}
		return sum;
	}
}