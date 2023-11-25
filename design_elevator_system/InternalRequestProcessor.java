package design_elevator_system;

import java.util.ArrayDeque;
import java.util.Queue;

public class InternalRequestProcessor {
   
	ElevatorManager elevatorManager;
	
	Queue<InternalRequest> qu = new ArrayDeque<>();
	
	public InternalRequestProcessor() {
		this.elevatorManager = ElevatorManager.getElevatorInstance();
	}
	
	public void processInternalRequest(InternalRequest internalRequest) {
		Elevator elevator = elevatorManager.map.get(internalRequest.getElevatorId());
		ElevatorController controller = elevator.getController();
		controller.moveElevatorToFloor(internalRequest);
	}
}
