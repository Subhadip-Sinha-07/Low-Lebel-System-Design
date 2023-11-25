package design_elevator_system;

public class Main {

	public static void main(String[] args) {

		ElevatorSystem elevatorSystem = new ElevatorSystem();
		elevatorSystem.initializeElevator(10);
		ExternalRequest externalRequest = new ExternalRequest();
		externalRequest.setDirection(Direction.UP);
		externalRequest.setSrcfloor(2);

		InternalRequest internalRequest = new InternalRequest();
		internalRequest.setDestFloor(3);
		internalRequest.setElevatorId(2);

		elevatorSystem.pricessExternalRequest(externalRequest);
		elevatorSystem.processInternalRequest(internalRequest);
	}
}