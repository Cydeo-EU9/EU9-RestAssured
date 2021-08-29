package com.cybertek.day10;

import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class FormulaOneXmlTest {

    @BeforeAll
    public static void setUp(){
        baseURI = "http://ergast.com";


    }
}
