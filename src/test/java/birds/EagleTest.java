package birds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EagleTest {
    @Test
    public void testItFliesInTheAir() {
        Eagle eagle = new Eagle(5);
        eagle.fly();
        Assertions.assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItLosesFeathers() {
        Eagle eagle = new Eagle(5);
        eagle.molt();
        Assertions.assertEquals(4, eagle.numberOfFeathers);
    }
}
