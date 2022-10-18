package weather;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class WeatherRequest {

    public static RequestSpecification getWeatherInfoByCityID(int id) {
        return new RequestSpecBuilder()
                .addParam("id", id)
                .build()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
