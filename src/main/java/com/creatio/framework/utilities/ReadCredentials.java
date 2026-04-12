package com.creatio.framework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadCredentials {

	public static Properties readcredentials(String data) throws IOException {
		Properties credprop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+data);
		credprop.load(fs);
		return credprop;
		
	}
}
