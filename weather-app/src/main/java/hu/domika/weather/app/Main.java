package hu.domika.weather.app;

import hu.domika.weather.api.WeatherForecast;

import java.util.ServiceLoader;

/**
 * @author Balazs_Domonkos
 */
public class Main {
    private static String CITY = "Budapest";

    public static void main(String[] args) {
        Iterable<WeatherForecast> forecasts = ServiceLoader.load(WeatherForecast.class);
        for (WeatherForecast forecast: forecasts) {
            System.out.println(forecast.getWeatherForecast(CITY));
        }
    }
}
