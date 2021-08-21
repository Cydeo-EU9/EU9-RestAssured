package com.cybertek.utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public abstract class SpartanTestBase {

    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://52.207.61.129:8000";

        String dbUrl = "jdbc:oracle:thin:@52.207.61.129:1521:xe";
        String dbUsername = "SP";
        String dbPassword = "SP";

        DBUtils.createConnection(dbUrl,dbUsername,dbPassword);
    }

    @AfterAll
    public void teardown(){

        DBUtils.destroy();
    }



}
