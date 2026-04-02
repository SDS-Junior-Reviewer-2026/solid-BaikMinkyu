package weather;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testReturnsCurrentWeather() {
        WeatherTracker tracker = new WeatherTracker();
        tracker.setCurrentConditions("rainy");

        Assertions.assertEquals("rainy", tracker.currentConditions);
    }

    @Test
    public void testAlertsPhoneUsersWhenRaining() {
        WeatherTracker tracker = new WeatherTracker();
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("rainy");

        Assertions.assertEquals("It is rainy", outContent.toString());
    }

    @Test
    public void testAlertsViaEmailWhenSunny() {
        WeatherTracker tracker = new WeatherTracker();
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("sunny");

        Assertions.assertEquals("It is sunny", outContent.toString());
    }
}
