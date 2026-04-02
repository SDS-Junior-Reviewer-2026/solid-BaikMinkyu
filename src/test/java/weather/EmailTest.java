package weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    public void testGeneratesAlertString() {
        Email email = new Email();
        Assertions.assertEquals("It is sunny", email.generateWeatherAlert("sunny"));
    }
}
