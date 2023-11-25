package design_elevator_system;

public class ElevatorController {

	ElevatorState elevatorState;

	ElevatorControlStrategy strategy = null;

	public ElevatorController(ElevatorControlStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void setStrategy(ElevatorControlStrategy strategy) {
		this.strategy = strategy;
	}

	public void moveElevatorToFloor(InternalRequest request) {
		elevatorState.setNextFloor(request.getDestFloor());
		strategy.determineNextStop(request);
	}

	public ElevatorState getCurrentState() {
		return elevatorState;
	}

	public void setCurrentState(ElevatorState elevatorState) {
		this.elevatorState = elevatorState;
	}
}