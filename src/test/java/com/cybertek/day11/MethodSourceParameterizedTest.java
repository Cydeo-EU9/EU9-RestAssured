package com.cybertek.day11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

public class MethodSourceParameterizedTest {


    @ParameterizedTest
    @MethodSource("getNames")
    public void testPrintNames(String name){

        System.out.println("name = " + name);
    }



    public static List<String> getNames(){
        //you can get value from anywhere almost anytype and return to your test
        //DB
        //Excel
        //other APIs

        List<String> nameList = Arrays.asList("Parvin","Nasim","mohamad","Nadir","Saim","Gurhan","Murodil");
        return  nameList;
    }


}
