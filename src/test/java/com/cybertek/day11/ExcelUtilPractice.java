package com.cybertek.day11;

import com.cybertek.utilities.ExcelUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
