package org.example.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + getAverageTemperature() + "/" + getMaximumTemperature() + "/" + getMinimumTemperature());
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());
        display();
    }

    private float getAverageTemperature() {
        OptionalDouble tmp = temperatures.stream().mapToDouble(i -> i.doubleValue()).average();
        return (float) tmp.getAsDouble();
    }

    private float getMinimumTemperature() {
        return (float) temperatures.stream().mapToDouble(i -> i.doubleValue()).min().getAsDouble();
    }

    private float getMaximumTemperature() {
        return (float) temperatures.stream().mapToDouble(i -> i.doubleValue()).max().getAsDouble();
    }
}
