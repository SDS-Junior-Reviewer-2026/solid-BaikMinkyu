package house;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        Assertions.assertEquals(4, penthouse.numberOfBedrooms);
    }

    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        Assertions.assertEquals(1500, penthouse.squareFootage);
    }
}
