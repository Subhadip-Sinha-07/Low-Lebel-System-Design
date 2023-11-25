package design_elevator_system;

public interface ElevatorSelectionStrategy {

	public Elevator selectElevator(ExternalRequest externalRequest);
}
