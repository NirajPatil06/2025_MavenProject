package com.creatio.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil3 {


   public static Properties readDataFromConfigFile(String fileName4) {
	   
	   Properties prop3 = new Properties();
	   
	   try {
		   
		   FileInputStream  fs3 = new FileInputStream(System.getProperty("user.dir")+ "\\Config\\"+ fileName4);
		   prop3.load(fs3);
	   }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }catch(IOException e) {
		   
		   e.printStackTrace();
	   }
	   
	   return prop3;
   }
}
