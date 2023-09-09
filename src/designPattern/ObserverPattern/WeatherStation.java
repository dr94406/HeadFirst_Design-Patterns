package designPattern.ObserverPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        src.designPattern.ObserverPattern.CurrentConditionsDisplay currentConditionsDisplay = new src.designPattern.ObserverPattern.CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
