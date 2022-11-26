package com.cydeo.day11;

import com.cybertek.utilities.*;
import io.restassured.http.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.*;

import static io.restassured.RestAssured.*;

public class BookitParametrized {


        public static List<Map<String,String>> getExcelData(){

            ExcelUtil bookitFile = new ExcelUtil("src/test/resources/BookItQa3.xlsx","QA3");

            return bookitFile.getDataList();
        }

        @ParameterizedTest
        @MethodSource("getExcelData")
        public void bookItTest(Map<String,String> user){
            System.out.println("user.get(\"email\") = " + user.get("email"));
            System.out.println("user.get(\"password\") = " + user.get("password"));

            given()
                    .accept(ContentType.JSON)
                    .baseUri("https://cybertek-reservation-api-qa3.herokuapp.com")
                    .queryParams(user) //I pass map directly because query param keys and map keys are equal
            .when()
                    .get("/sign")
            .then()
                    .statusCode(200)
                    .log().body();



        }

}
