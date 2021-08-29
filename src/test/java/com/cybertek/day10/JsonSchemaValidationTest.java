package com.cybertek.day10;

import com.cybertek.utilities.SpartanAuthTestBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class JsonSchemaValidationTest extends SpartanAuthTestBase {

    @DisplayName("GET request to verify one spartan against to schema")
    @Test
    public void schemaValidation(){

            given()
                    .accept(ContentType.JSON)
                    .and()
                    .pathParam("id",10)
                    .and()
                    .auth().basic("admin","admin")
            .when()
                    .get("/api/spartans/{id}")
            .then()
                    .statusCode(200)
                    .log().all();

    }

}
