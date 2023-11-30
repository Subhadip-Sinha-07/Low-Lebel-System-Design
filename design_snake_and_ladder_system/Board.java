package design_snake_and_ladder_system;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Board {

	int boardid;

	Cell[][] board;

	public Cell[][] getBoard() {
		return board;
	}

	public void setBoard(Cell[][] board) {
		this.board = board;
	}

	public Board(int id) {
		this.boardid = id;
	}

	public void initializeBoard(int size, int noOfSnake, int noOfLadder) {
		board = new Cell[size][size];
		addSnakeAndLadder(noOfSnake,noOfLadder);
	}

	public void addSnakeAndLadder(int noOfSnake, int noOfLadder) {
		Set<Integer> tracker = new HashSet<>();
		while (noOfSnake > 0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);
			int snakeTail = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);
			if (snakeTail >= snakeHead) {
				continue;
			}
			if (tracker.contains(snakeHead)) {
				continue;
			}
			tracker.add(snakeHead);
			Item item = new Item();
			item.setCelltype(CellType.snake);
			item.setStart(snakeHead);
			item.setEnd(snakeTail);

			Cell cell = new Cell();
			cell.setCellNo(snakeHead);
			cell.setItem(item);

			int row = snakeHead % board.length;
			int col = snakeHead / board.length;
			board[row][col] = cell;
			noOfSnake--;
		}
		while (noOfLadder > 0) {
			int ladderHead = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);
			int ladderEnd = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);

			if (ladderEnd <= ladderHead) {
				continue;
			}
			if (tracker.contains(ladderHead)) {
				continue;
			}
			tracker.add(ladderHead);
			Item item = new Item();
			item.setCelltype(CellType.ladder);
			item.setStart(ladderHead);
			item.setEnd(ladderEnd);

			Cell cell = new Cell();
			cell.setCellNo(ladderHead);
			cell.setItem(item);

			int row = ladderHead % board.length;
			int col = ladderHead / board.length;
			board[row][col] = cell;
			noOfLadder--;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == null) {
					Item item = new Item();
					item.setCelltype(CellType.Normal);
					Cell cell = new Cell();
					cell.setCellNo(i * board.length + j);
					cell.setItem(item);
					board[i][j] = cell;
				}
			}
		}
	}
}