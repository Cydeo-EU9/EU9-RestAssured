package com.cybertek.day12;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MockApi {


    //https://e787164d-adbd-474e-8c98-6796a1e3af70.mock.pstmn.io


    @Test
    public void test1(){

        given().baseUri("https://e787164d-adbd-474e-8c98-6796a1e3af70.mock.pstmn.io")
                .accept(ContentType.JSON)
        .when()
                .get("/customer")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstName",is("John"));

    }

    @Test
    public void test2(){

        given().baseUri("https://e787164d-adbd-474e-8c98-6796a1e3af70.mock.pstmn.io")
                .accept(ContentType.JSON)
                .when()
                .get("/employees")
                .prettyPrint();

    }

}
