package org.example;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 75, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
