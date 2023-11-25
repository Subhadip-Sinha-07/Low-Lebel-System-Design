package design_elevator_system;

public class ExternalRequestProcessor {

	ElevatorSelectionStrategy elevatorSelectionStrategy;

	ElevatorManager eleMgr = null;

	public ExternalRequestProcessor(ElevatorSelectionStrategy elevatorSelectionStrategy) {
		this.elevatorSelectionStrategy = elevatorSelectionStrategy;
		this.eleMgr = ElevatorManager.getElevatorInstance();
	}

	public void processExternalRequest(ExternalRequest externalRequest) {
		Elevator elevator = elevatorSelectionStrategy.selectElevator(externalRequest);
		ElevatorController controller = elevator.getController();
		ElevatorState state = controller.getCurrentState();
		state.setCurrFloor(externalRequest.getSrcfloor());
		state.setElevatorStatus(ElevatorStatus.MOVING);
		eleMgr.map.put(elevator.getId(), elevator);
	}
}