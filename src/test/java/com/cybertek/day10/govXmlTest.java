package com.cybertek.day10;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class govXmlTest {



    @Test
    public void test1(){
        //send a get request to
        //https://data.ct.gov/api/views/qm34-pq7e/rows.xml
        //get all the years
        //get all unknowns
        //get 2005 other
        //get 2007 _address
        Response response = get("https://data.ct.gov/api/views/qm34-pq7e/rows.xml")
                            .then().statusCode(200).extract().response();

        XmlPath xmlPath = response.xmlPath();

        //get all the years
        List<Integer> years = xmlPath.getList("response.row.row.year");
        System.out.println("list = " + years);
        //get all unknowns
        List<Integer> unknowns = xmlPath.getList("response.row.row.unknown");
        System.out.println("unknowns = " + unknowns);
        //get 2005 other
        int other2005 = xmlPath.getInt("response.row.row[2].other");
        System.out.println("other2005 = " + other2005);
        //get 2007 _address
        String address2007 = xmlPath.getString("response.row.row[4].@_address");
        System.out.println("address2007 = " + address2007);


    }
}
