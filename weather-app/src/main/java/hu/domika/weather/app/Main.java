package hu.domika.weather.app;

import hu.domika.weather.api.WeatherForecast;
import hu.domika.weather.service.AccuWeatherForecast;

/**
 * @author Balazs_Domonkos
 */
public class Main {

    public static void main(String[] args) {
        WeatherForecast forecast = new AccuWeatherForecast();
        System.out.println(forecast.getWeatherForecast("Budapest"));
    }
}
