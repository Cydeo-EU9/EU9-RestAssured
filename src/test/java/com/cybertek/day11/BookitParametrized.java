package com.cybertek.day11;

import com.cybertek.utilities.ExcelUtil;
import io.restassured.http.ContentType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
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
