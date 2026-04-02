package weather;

public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        currentConditions = weatherDescription;
        Notifier notifier = NotifierFactory.create(weatherDescription);
        if (notifier != null) {
            System.out.print(notifier.generateWeatherAlert(weatherDescription));
        }
    }
}