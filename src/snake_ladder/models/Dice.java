package snake_ladder.models;

import java.util.Random;

public class Dice {
	private int number;
	private Random random;
	public Dice(int number) {
		this.number = number;
		this.random = new Random();
	}
	public int getNumberOfDices() {
		return this.number;
	}
	public int roll() {
		return random.nextInt((6 * number - 1) + 1) + 1;
	}
}
