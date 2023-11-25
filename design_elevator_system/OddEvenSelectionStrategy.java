package design_elevator_system;

import java.util.List;

public class OddEvenSelectionStrategy implements ElevatorSelectionStrategy {

	ElevatorManager mgr = ElevatorManager.getElevatorInstance();

	@Override
	public Elevator selectElevator(ExternalRequest externalRequest) {
		List<Elevator> getListOfElevator = mgr.getListOfElevator();
		for (Elevator ele : getListOfElevator) {
			if (ele.getId() % 2 == 0 && externalRequest.srcfloor % 2 == 0) {
				return ele;
			} else if (ele.getId() % 2 == 1 && externalRequest.srcfloor % 2 == 1) {
				return ele;
			}
		}
		return null;
	}
}