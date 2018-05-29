# Java Module System Demo

This is a demo application for practicing purposes to meet and play with Java 9 new Module System.

### Build
mvn clean install

### Run
java --module-path app/target/app-1.0-SNAPSHOT.jar;accuweather/target/accuweather-1.0-SNAPSHOT.jar;weather/target/weather-1.0-SNAPSHOT.jar --module hu.domika.app/hu.domika.app.Main
