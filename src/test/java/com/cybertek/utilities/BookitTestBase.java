package com.cybertek.utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class BookitTestBase {
    public static RequestSpecification teacherReqSpec;
    public static RequestSpecification studentMemberReqSpec;
    public static RequestSpecification studentLeaderReqSpec;

    @BeforeAll
    public static void init(){
      baseURI = ConfigurationReader.getProperty("qa3_api_url");

        teacherReqSpec = given()
                                .accept(ContentType.JSON)
                                .header("Authorization","teacherTokenHere")

    }

    @AfterAll
    public static void teardown(){
        reset();
    }

    //teacher , student-member,student-leader
    //it will take user info from conf.properties
    public static String getTokenByRole(String role){
        //switch,if make sure you get correct user info
        //send request/get token/ return token




    }

}
