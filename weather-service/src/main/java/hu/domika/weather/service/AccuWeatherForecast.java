package hu.domika.weather.service;

import hu.domika.weather.api.WeatherForecast;

/**
 * @author Balazs_Domonkos
 */
public class AccuWeatherForecast implements WeatherForecast {

    public String getWeatherForecast(String city) {
        return String.format("WeatherForecast forecast for %s: Showers and thunderstorms likely.", city);
    }
}
