package org.example.ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float currentPressure = 29.2f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("기상 예보: " + computePressure());
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    private String computePressure() {
        if (lastPressure < currentPressure)
            return "날씨가 좋아지고 있습니다!";
        else if (lastPressure > currentPressure)
            return "쌀쌀하며 비가 올 것 같습니다.";
        return "지금과 비슷할 것 같습니다.";
    }


}
