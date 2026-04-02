package greeter;

public class GreetFactory {
    public static Greet create(String formality) {
        return formality == null ?
                new NormalGreet() :
                switch (formality) {
            case "formal" -> new FormalGreet();
            case "casual" -> new CasualGreet();
            case "intimate" -> new IntimateGreet();
            default -> new NormalGreet();
        };
    }
}
