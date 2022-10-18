package weather;

import base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WeatherTest extends TestBase {

    @DisplayName("Get should respond with weather info for city ID")
    @ParameterizedTest(name = "{index}. Test for city with id {0}")
    @ValueSource(ints = {2643743,2640729,3099434})
    @Tag("weather")
    @Tag("regression")
    public void shouldGetWeatherInfoByCityIDTest(int id) {
        given().
                spec(WeatherRequest.getWeatherInfoByCityID(id)).
        when().
                get();

    }


}
