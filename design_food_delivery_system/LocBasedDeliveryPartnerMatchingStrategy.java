package design_food_delivery_system;

import java.util.Arrays;
import java.util.List;

public class LocBasedDeliveryPartnerMatchingStrategy implements IDeliveryPartnerMathcingStrategy {

	@Override
	public List<DeliveryPartner> determineDelieveryPartner(DeliveryMetaData deliveryMetaData) {
		return Arrays.asList(new DeliveryPartner());
	}

}