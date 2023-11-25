package design_elevator_system;

public class LookAlgoStrategy implements ElevatorControlStrategy {

	@Override
	public int determineNextStop(InternalRequest request) {
		return 2;
	}

}
