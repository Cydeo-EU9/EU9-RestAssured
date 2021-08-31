package com.cybertek.day11;

import org.junit.jupiter.api.*;

public class TestLifeCycleAnnotations {

    //beforeClass is testNg version of beforeAll, same logic
    @BeforeAll
    public static void init(){
        System.out.println("Before all is running");
    }
    //beforeMethod is testNg version of beforeEach, same logic
    @BeforeEach
    public void initEach(){
        System.out.println("\tBefore each is running");
    }

    @AfterEach
    public void closeEach(){
        System.out.println("\tAfter each is running");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running");
    }

    @Disabled
    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }

    @AfterAll
    public static void close(){
        System.out.println("After all is running");
    }


}
