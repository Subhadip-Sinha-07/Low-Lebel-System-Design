package design_food_delivery_system;

import java.util.List;

public interface IDeliveryPartnerMathcingStrategy {

	List<DeliveryPartner> determineDelieveryPartner(DeliveryMetaData deliveryMetaData);
}