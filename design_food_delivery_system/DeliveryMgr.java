package design_food_delivery_system;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class DeliveryMgr {

	private static DeliveryPartnerMgr partnerMgr = DeliveryPartnerMgr.getDeliveryParMgr();

	private static StrategyMgr strategyMgr = StrategyMgr.getStrategyMgr();

	private static DeliveryMgr deliveryMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	public static DeliveryMgr getDeliveryMgr() {
		if (deliveryMgr == null) {
			lock.lock();
			if (deliveryMgr == null) {
				deliveryMgr = new DeliveryMgr();
			}
			lock.unlock();
		}
		return deliveryMgr;
	}

	public void setStrategyToSelectDeliveryPartners(IDeliveryPartnerMathcingStrategy deliveryPartnerMathcingStrategy) {
		strategyMgr.setDeliverPartnerMatchingStrategy(deliveryPartnerMathcingStrategy);
	}

	public DeliveryPartner getDeliveryPartner() {
		List<DeliveryPartner> dp = strategyMgr.getListOfDeliveryPartner(new DeliveryMetaData());
		return dp.get(0);
	}

	public void performDelivery(int dpId, int userId, int orderId) {
		partnerMgr.performDelivery(userId, userId, orderId);
	}
}