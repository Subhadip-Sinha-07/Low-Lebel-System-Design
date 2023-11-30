package design_snake_and_ladder_system;

public class Game {

	private Board board;

	private int gameId;

	public Game(int boardId) {
		board = new Board(boardId);
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void initializeBoard(int size, int noOfSnake, int noOfLadder) {
		board.initializeBoard(size, noOfSnake, noOfLadder);
	}
}