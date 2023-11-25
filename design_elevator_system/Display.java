package design_elevator_system;

import java.util.List;

public class Display {
	int currfloor;

	List<Floor> listOfFloor;

	Direction direction;

	public List<Floor> getListOfFloor() {
		return listOfFloor;
	}

	public void setListOfFloor(List<Floor> listOfFloor) {
		this.listOfFloor = listOfFloor;
	}

	public int getCurrfloor() {
		return currfloor;
	}

	public void setCurrfloor(int currfloor) {
		this.currfloor = currfloor;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}