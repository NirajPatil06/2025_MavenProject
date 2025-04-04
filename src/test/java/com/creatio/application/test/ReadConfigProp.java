package com.creatio.application.test;

import java.util.Properties;

import com.creatio.framework.utilities.PropUtil2;

public class ReadConfigProp {

	public static void main(String[] args) {

		Properties prop2 = PropUtil2.readconfigData("config.properties");
		
		
		System.out.println(prop2.getProperty("Username"));
		System.out.println(prop2.getProperty("ApplicationUrl"));
	}

}
