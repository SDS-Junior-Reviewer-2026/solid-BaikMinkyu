package greeter;

public class NormalGreet implements Greet {
    @Override
    public String getGreeting() {
        return "Hello.";
    }
}
