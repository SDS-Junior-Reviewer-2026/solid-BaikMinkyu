package greeter;

public class Greeter {
    String formality;

    public String greet() {
        return GreetFactory.create(formality)
                .getGreeting();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}