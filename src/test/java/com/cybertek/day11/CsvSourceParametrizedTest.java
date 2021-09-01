package com.cybertek.day11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceParametrizedTest {

    // Test first number + second number = third number
//            1, 3 , 4
//            2, 3 , 5
//            8, 7 , 15
//            10, 9 , 19

    @ParameterizedTest
    @CsvSource({"1, 3 , 4",
                "2, 3 , 5",
                "8, 7 , 15",
                "10, 9 , 19"})
    public void testAddition(int num1,int num2, int sum){


    }

}
