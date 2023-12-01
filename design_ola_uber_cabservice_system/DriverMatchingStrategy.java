package design_ola_uber_cabservice_system;

public interface DriverMatchingStrategy {

	Driver matchDriver(TripMetaData tripMetaData);
}