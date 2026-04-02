package weather;

public class NotifierFactory {
    public static Notifier create(String weatherDescription) {
        return switch (weatherDescription) {
            case "rainy" -> new Phone();
            case "sunny" -> new Email();
            default -> null;
        };
    }
}
