package greeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        Assertions.assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        Assertions.assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality("casual");
        Assertions.assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        Assertions.assertEquals("Hello Darling!", greeter.greet());
    }
}
