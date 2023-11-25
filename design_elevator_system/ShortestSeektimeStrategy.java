package design_elevator_system;

public class ShortestSeektimeStrategy implements ElevatorControlStrategy {

	@Override
	public int determineNextStop(InternalRequest request) {
		return 5;
	}

}
