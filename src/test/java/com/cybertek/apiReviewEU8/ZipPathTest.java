package com.cybertek.apiReviewEU8;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class ZipPathTest extends ZipBase{

    @Test
    public void pathTest(){
        Response response = given().accept(ContentType.JSON)
                .pathParam("zip",22031)
                .when()
                .get("/{zip}");
        response.prettyPrint();
    }
}
