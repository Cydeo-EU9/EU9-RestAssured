package com.cydeo.day11;

import com.cybertek.utilities.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class ExcelUtilPractice {



    @Test
    public void test1(){

        //How to use excelUtil file ?
        //it accepts two arguments
        //Argument 1: location of the file(path)
        //Argument 2: sheet that we want to open
        ExcelUtil vytrackFile = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");

        //method for returning list of map
        List<Map<String, String>> dataList = vytrackFile.getDataList();
        for (Map<String, String> rowmap : dataList) {
            System.out.println(rowmap);
        }

    }

}
