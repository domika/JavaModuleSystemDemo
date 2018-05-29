package hu.domika.app;

import hu.domika.accuweather.AccuWeatherForecast;
import hu.domika.weather.WeatherForecast;

/**
 * @author Balazs_Domonkos
 */
public class Main {

    public static void main(String[] args) {
        WeatherForecast forecast = new AccuWeatherForecast();
        System.out.println(forecast.getWeatherForecast("Budapest"));
    }
}
