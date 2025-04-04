package com.creatio.application.test;

import java.util.Properties;

import com.creatio.framework.utilities.PropUtil3;

public class ReadConfig3 {

	public static void main(String[] args) {

		Properties prop4 = PropUtil3.readDataFromConfigFile("Config.properties");
		
		System.out.println(prop4.getProperty("ApplicationUrl"));
	}

}
