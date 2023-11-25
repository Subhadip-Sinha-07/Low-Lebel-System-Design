package design_elevator_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class ElevatorManager {

	public static ElevatorManager elevatormgr = null;

	public static ReentrantLock lock = new ReentrantLock();

	Map<Integer, Elevator> map = new HashMap<Integer, Elevator>();

	private ElevatorManager() {

	}

	public static ElevatorManager getElevatorInstance() {
		if (elevatormgr == null) {
			lock.lock();
			if (elevatormgr == null) {
				elevatormgr = new ElevatorManager();
			}
			lock.unlock();
		}
		return elevatormgr;
	}

	public void initializeElevator(int noofelevator) {
		for (int i = 1; i <= noofelevator; i++) {
			Elevator elevator = new Elevator();
			ElevatorController controller = new ElevatorController(new ShortestSeektimeStrategy());
			elevator.setController(controller);
			controller.setCurrentState(new ElevatorState());
			map.put(i, elevator);
		}
	}

	public List<Elevator> getListOfElevator() {
		List<Elevator> elevator = new ArrayList<>();
		for (Integer id : map.keySet()) {
			elevator.add(map.get(id));
		}
		return elevator;
	}

	public Elevator getElevator(int eid) {
		return map.get(eid);
	}
}