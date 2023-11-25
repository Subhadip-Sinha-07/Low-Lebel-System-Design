package design_elevator_system;

public class ExternalRequest {

	int srcfloor;

	Direction direction;

	public int getSrcfloor() {
		return srcfloor;
	}

	public void setSrcfloor(int srcfloor) {
		this.srcfloor = srcfloor;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}