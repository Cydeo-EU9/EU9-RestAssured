package com.cybertek.apiReviewEU8;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ZipTestWithHemcrest extends ZipBase {

    @Test
    public void hemcrestTest(){

        given().log().all().accept(ContentType.JSON)
                .and().pathParam("zip",22031)
                .when().get("/{zip}")
                .then().assertThat().statusCode(200).and().contentType("application/json")
                .and().assertThat().header("Server", equalTo("cloudflare")).header("Report-To",notNullValue())
                .body("country",equalTo("United States"),
                        "'post code'",equalTo("22031"),
                        "places[0].state",equalTo("Virginia"),
                        "'country abbreviation'",is("US"),
                        "places[0].'place name'",is("Fairfax"),
                        "places[0].latitude",equalTo("38.8604"))
                .log().all();


        // to verify this statement without assigning to a response we use hemcrest Matchers library

    }
}
