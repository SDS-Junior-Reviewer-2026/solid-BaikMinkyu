package vehicle;

public class GasStation {
    // this is not a car's responsibility.
    public void reFuel(Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}
