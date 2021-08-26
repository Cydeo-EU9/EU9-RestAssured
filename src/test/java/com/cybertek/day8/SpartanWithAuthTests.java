package com.cybertek.day8;

import com.cybertek.utilities.SpartanAuthTestBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class SpartanWithAuthTests extends SpartanAuthTestBase {

    @DisplayName("GET /api/spartans as a public user(guest) expect 401 ")
    @Test
    public void test1(){
            given().accept(ContentType.JSON).
                    when().
            get("/api/spartans")
                    .then().statusCode(401)
                    .log().all();

    }

    @DisplayName("GET /api/spartans as admin user expect 200")
    @Test
    public void testAdmin(){
        //how to pass admin admin as a username and password ?
        given()
                .auth().basic("admin","admin")
                .and().accept(ContentType.JSON)
        .when()
                .get("/api/spartans")
        .then()
                .statusCode(200)
                .log().all();



    }




}
