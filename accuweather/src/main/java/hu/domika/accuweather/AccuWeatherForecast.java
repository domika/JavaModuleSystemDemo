package hu.domika.accuweather;

import hu.domika.weather.WeatherForecast;

/**
 * @author Balazs_Domonkos
 */
public class AccuWeatherForecast implements WeatherForecast {

    public String getWeatherForecast(String city) {
        return String.format("WeatherForecast forecast for %s: Showers and thunderstorms likely.", city);
    }
}
