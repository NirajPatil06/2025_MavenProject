package sample;

import java.io.IOException;
import java.util.Properties;

import com.creatio.framework.utilities.ReadCredentials;

public class Cred {
	public static void main (String[]args) throws IOException {
		
		Properties cred = ReadCredentials.readcredentials("Credentials.properties");
		
		System.out.println(cred.getProperty("user2"));
	}

}
