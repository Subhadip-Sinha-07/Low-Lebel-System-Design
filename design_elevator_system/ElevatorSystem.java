package design_elevator_system;

public class ElevatorSystem {

	ElevatorManager elevatorMgr = null;

	InternalRequestProcessor internalRequestProcessor = null;

	ExternalRequestProcessor externalRequestProcessor = null;

	public ElevatorSystem() {
		elevatorMgr = ElevatorManager.getElevatorInstance();
	}

	public void initializeElevator(int noofElevator) {
		elevatorMgr.initializeElevator(noofElevator);
	}

	public void pricessExternalRequest(ExternalRequest externalRequest) {
		externalRequestProcessor = new ExternalRequestProcessor(new OddEvenSelectionStrategy());
		externalRequestProcessor.processExternalRequest(externalRequest);
	}

	public void processInternalRequest(InternalRequest internalRequest) {
		internalRequestProcessor = new InternalRequestProcessor();
		internalRequestProcessor.processInternalRequest(internalRequest);
	}
}