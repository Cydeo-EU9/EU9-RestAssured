package com.cydeo.day10;

import com.cybertek.utilities.*;
import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class ResponseTimeTest extends SpartanAuthTestBase {


    @Test
    public void test1(){

        Response response = given()
                .auth().basic("admin", "admin")
                .accept(ContentType.JSON)
                .when()
                .get("/api/spartans")
                .then()
                .time(both(greaterThan(500L)).and(lessThanOrEqualTo(1100L)))
                .extract().response();

        System.out.println("response.getTime() = " + response.getTime());


    }
}
