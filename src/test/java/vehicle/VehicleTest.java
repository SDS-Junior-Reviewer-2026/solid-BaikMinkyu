package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void test_sample() {
        Vehicle vehicle = new Vehicle(10);
        Assertions.assertEquals(10, vehicle.getRemainingFuel());
    }
}
