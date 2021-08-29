package com.cybertek.day10;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SSLTest {


    @Test
    public void test1(){
            given().
                    relaxedHTTPSValidation(). //even if it doesnt have valid certificate I want to send request
                     when().get("https://untrusted-root.badssl.com/")
                    .prettyPrint();

    }

    @Test
    public void keyStore(){

        given()
                .keyStore("pathtofile","password")
            .when().get("apiurl");

    }





}
