package design_snake_and_ladder_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class GameManager {

	private static GameManager gameManager = null;

	private static DiceMgr mgr = DiceMgr.getDiceManager();

	private static ReentrantLock lock = new ReentrantLock();

	private static Map<Integer, Game> map = new HashMap<>();

	private GameManager() {

	}

	public static GameManager getGameManagerInstance() {
		if (gameManager == null) {
			lock.lock();
			if (gameManager == null) {
				gameManager = new GameManager();
			}
			lock.unlock();
		}
		return gameManager;
	}

	public void addGame(Game game) {
		map.put(game.getGameId(), game);
	}

	public void addDice(int noOfDice) {
		mgr.addDice(noOfDice);
	}

	public void initializeBoard(int size, int noOfSnake, int noOfLadder, Game game) {
		game.initializeBoard(size, noOfSnake, noOfLadder);
	}

	public void startGame(Game game, Queue<Player> players) {
		int endPosition = game.getBoard().getBoard().length * game.getBoard().getBoard().length - 1;
		boolean winningStatus = false;
		while (!winningStatus) {
			Player player = players.poll();
			if (player.getCurrPostition() >= endPosition) {
				System.out.println(player.getName() + " Has Won the Game!!!!");
				winningStatus = true;
				break;
			}
			int currVal = mgr.rollDice();
			player.setCurrPostition(player.getCurrPostition() + currVal);
			players.add(player);
		}
	}
}