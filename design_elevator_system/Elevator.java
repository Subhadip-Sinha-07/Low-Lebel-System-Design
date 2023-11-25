package design_elevator_system;

import java.util.List;

public class Elevator {

	int id;

	int capacity;

	List<Display> display;

	ElevatorController controller;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Display> getDisplay() {
		return display;
	}

	public void setDisplay(List<Display> display) {
		this.display = display;
	}

	public ElevatorController getController() {
		return controller;
	}

	public void setController(ElevatorController controller) {
		this.controller = controller;
	}
}