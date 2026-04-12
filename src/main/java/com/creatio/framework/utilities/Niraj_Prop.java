package com.creatio.framework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Niraj_Prop {
	
	public static Properties readData(String propName) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+ propName); //read prop file
		prop.load(file);
		return prop;
	}

}
