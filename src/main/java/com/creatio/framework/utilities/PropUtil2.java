package com.creatio.framework.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil2 {
	

	public static Properties readconfigData(String fileName) {
		Properties prop1 = new Properties();		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+fileName); //read properties file
			prop1.load(fis); //load all properties to 'prop' variable
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 	prop1;	
	}
 
	
	}


