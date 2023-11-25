package design_elevator_system;

public class FirstComeFirstServeStrategy implements ElevatorControlStrategy {

	@Override
	public int determineNextStop(InternalRequest request) {
		return 3;
	}

}
