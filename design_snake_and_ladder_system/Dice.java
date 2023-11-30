package design_snake_and_ladder_system;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	int id;
	int min = 1;
	int max = 7;

	public Dice(int id) {
		this.id = id;
	}

	public int rollDice() {
		return ThreadLocalRandom.current().nextInt(min, max);
	}
}