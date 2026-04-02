package birds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PenguinTest {
    @Test
    public void testItLosesFeathers() {
        Penguin penguin = new Penguin(5);
        penguin.molt();
        Assertions.assertEquals(4, penguin.numberOfFeathers);
    }


    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin(5);
        penguin.swim();
        Assertions.assertEquals("in the water", penguin.currentLocation);
    }
}
