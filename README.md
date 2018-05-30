# Java Module System Demo

This is a demo application for practicing purposes to meet and play with Java 9 new Module System.

### Build
mvn clean install

### Run
java --module-path weather-app/target/weather-app-1.0-SNAPSHOT.jar;weather-service/target/weather-service-1.0-SNAPSHOT.jar;weather-api/target/weather-api-1.0-SNAPSHOT.jar --module weather.app/hu.domika.weather.app.Main
