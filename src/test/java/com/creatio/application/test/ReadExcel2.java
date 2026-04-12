package com.creatio.application.test;

import java.util.List;
import java.util.Map;

import com.creatio.framework.utilities.ExcelUtil;

public class ReadExcel2 {

	public static void main(String[] args) {

List<Map<String,String>> data = ExcelUtil.readData("EmpDetails.xlsx", "EmpData");		
		
		System.out.println(data.get(2).get("designation"));
	}

}
