package weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Phone phone = new Phone();
        Assertions.assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
