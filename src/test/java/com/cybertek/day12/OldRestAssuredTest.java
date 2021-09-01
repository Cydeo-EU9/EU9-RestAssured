package com.cybertek.day12;

import com.cybertek.utilities.SpartanNewBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OldRestAssuredTest extends SpartanNewBase {


    @Test
    public void getAllSpartan(){
        given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("admin","admin")
                .log().all()
        .when()
                .get("/spartans")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id[0]",is(1))
                .log().all();

    }


}
