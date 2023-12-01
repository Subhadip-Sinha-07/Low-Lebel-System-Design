package design_ola_uber_cabservice_system;

public interface PricingStrategy {

	int getPriceForTrip(TripMetaData tripMetaData);
}