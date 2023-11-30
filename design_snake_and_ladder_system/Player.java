package design_snake_and_ladder_system;

public class Player {

	private int playerId;

	private String name;

	private int currPostition;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrPostition() {
		return currPostition;
	}

	public void setCurrPostition(int currPostition) {
		this.currPostition = currPostition;
	}
}