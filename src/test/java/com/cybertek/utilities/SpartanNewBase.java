package com.cybertek.utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class SpartanNewBase {

    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://44.195.19.167";
        port = 7000;
        basePath ="/api";
    }

    @AfterAll
    public static void close(){
        //reset the info we set above ,method comes from restassured
        reset();
    }
}
