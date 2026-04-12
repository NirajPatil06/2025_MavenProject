package sample;

import java.io.IOException;
import java.util.Properties;

import com.creatio.framework.utilities.Niraj_Prop;

public class Test2 {

	public static void main(String[] args) throws IOException {

		Properties niraj = Niraj_Prop.readData("Niraj.properties");
		Properties config = Niraj_Prop.readData("Config.properties");
		
		System.out.println(niraj.getProperty("Designation"));
		System.out.println(config.getProperty("ApplicationUrl"));
	}

}
