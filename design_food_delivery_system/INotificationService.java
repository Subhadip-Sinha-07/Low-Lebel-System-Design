package design_food_delivery_system;

public interface INotificationService {

	public void sendNotification(int userId, int oredrId, String message);
}
