package design_snake_and_ladder_system;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		DiceMgr diceMgr = DiceMgr.getDiceManager();
		diceMgr.addDice(1);
		GameManager gameManager = GameManager.getGameManagerInstance();
		Game game = new Game(2);
		gameManager.addGame(game);
		gameManager.initializeBoard(10, 4, 5, game);
		Player player1 = new Player();
		player1.setPlayerId(2);
		player1.setName("Rohit");
		player1.setCurrPostition(0);
		Player player2 = new Player();
		player2.setPlayerId(3);
		player2.setName("MSD");
		player2.setCurrPostition(0);
		Queue<Player> qu = new ArrayDeque<>();
		qu.add(player1);
		qu.add(player2);
		gameManager.startGame(game, qu);
	}
}