package greeter;

public class FormalGreet implements Greet {
    @Override
    public String getGreeting() {
        return "Good evening, sir.";
    }
}
