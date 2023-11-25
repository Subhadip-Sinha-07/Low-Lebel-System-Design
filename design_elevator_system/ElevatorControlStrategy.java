package design_elevator_system;

public interface ElevatorControlStrategy {

	int determineNextStop(InternalRequest request);
}
