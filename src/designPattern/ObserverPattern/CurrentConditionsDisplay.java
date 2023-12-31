package src.designPattern.ObserverPattern;

public class CurrentConditionsDisplay implements designPattern.ObserverPattern.Observer, designPattern.ObserverPattern.DisplayElement {

    private float temperature;
    private float humidity;
    private designPattern.ObserverPattern.WeatherData weatherData;

    // 생성자에 weather 주제 전달 및 객체를 써서 디스플레이를 옵저버로 등록
    public CurrentConditionsDisplay(designPattern.ObserverPattern.WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update() {

    }
}
