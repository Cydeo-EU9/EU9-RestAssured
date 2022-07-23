package com.cybertek.apiReviewEU8;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ZipTestWithCollection extends ZipBase{

    @Test
    public void collectionTest(){
        Response response = given().accept(ContentType.JSON)
                .pathParam("zip",22031)
                .when()
                .get("/{zip}");
        response.prettyPrint();
      //  System.out.println("response.toString() = " + response.asString());
// De-Serialization
        Map<String,Object> postCode =  response.body().as(Map.class);
        System.out.println("postCode.get(\"post code\") = " + postCode.get("post code"));

        assertEquals("United States",postCode.get("country"));

        // "state": "Virginia" verify: this information is inside the "places" key
        List<Map<String,Object>> places = (List<Map<String, Object>>) postCode.get("places");

    }
}
