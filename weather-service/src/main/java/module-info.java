module weather.service {
    requires transitive weather.api;

    provides hu.domika.weather.api.WeatherForecast with hu.domika.weather.service.AccuWeatherForecast;
}