package design_food_delivery_system;

public class EmailNotificationService implements INotificationService {

	@Override
	public void sendNotification(int userId, int oredrId, String message) {
		System.out.println("This is the current status " + message);
	}
}