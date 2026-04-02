package house;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        Assertions.assertEquals(0, studio.numberOfBedrooms);
    }

    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        Assertions.assertEquals(600, studio.squareFootage);
    }
}
