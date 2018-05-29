package hu.domika.accuweather;

/**
 * @author Balazs_Domonkos
 */
public class AccuWeatherForecast {

    public String getWeatherForecast(String city) {
        return String.format("Weather forecast for %s: Showers and thunderstorms likely.", city);
    }
}
