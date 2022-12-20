package com.eurotech.pages;

import com.eurotech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestinExcel {
    public static void main(String[] args) {


        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTest_B5.xlsx", "Test Data");
        List<Map<String, String>> dataList = excelUtil.getDataList();
        System.out.println("dataList = " + dataList);
        System.out.println("dataList.get(4).get(\"Name\") = " + dataList.get(4).get("Name")); //Feride
        System.out.println("dataList.get(6).get(\"Title\") = " + dataList.get(6).get("Title")); //SDET
        System.out.println("dataList.get(5).get(\"Name\") = " + dataList.get(5).get("Name")); //Ensar1905

    }
}
