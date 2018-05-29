package hu.domika.app;

import hu.domika.accuweather.AccuWeatherForecast;

/**
 * @author Balazs_Domonkos
 */
public class Main {

    public static void main(String[] args) {
        AccuWeatherForecast forecast = new AccuWeatherForecast();
        System.out.println(forecast.getWeatherForecast("Budapest"));
    }
}
