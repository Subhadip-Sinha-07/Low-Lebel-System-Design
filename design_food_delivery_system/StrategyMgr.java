package design_food_delivery_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class StrategyMgr {

	IDeliveryPartnerMathcingStrategy strategy = null;

	private static StrategyMgr strategyMgr = null;

	private static ReentrantLock lock = new ReentrantLock();

	Map<Integer, OrderInfo> mapOfOrder = new HashMap<>();

	public static StrategyMgr getStrategyMgr() {
		if (strategyMgr == null) {
			lock.lock();
			if (strategyMgr == null) {
				strategyMgr = new StrategyMgr();
			}
			lock.unlock();
		}
		return strategyMgr;
	}

	public void setDeliverPartnerMatchingStrategy(IDeliveryPartnerMathcingStrategy strategy) {
		this.strategy = strategy;
	}

	public List<DeliveryPartner> getListOfDeliveryPartner(DeliveryMetaData deliveryMetaData) {
		return strategy.determineDelieveryPartner(deliveryMetaData);
	}
}