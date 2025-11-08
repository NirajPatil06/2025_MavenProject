package interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectins {

	public static void main(String[] args) {

		//List
		
		List<String> empName= new ArrayList<String>();
		
		empName.add("Niraj");
		empName.add("Niraj");
		empName.add("Niraj");
		empName.add("Niraj");
		System.out.println(empName);
		
		Set <String> empSurname = new HashSet <String>();
		
		empSurname.add("Patil");
		empSurname.add("Patil1");
		empSurname.add("Patil2");
		empSurname.add("Patil3");
		
		System.out.println(empSurname.size());
		System.out.println(empSurname);
		
		Map <String,Integer> empData = new HashMap <String,Integer>();
		empData.put("Niraj", 25);
		empData.put("Niraj12", 24);
		System.out.println(empData.size());
		System.out.println(empData);
	}

}
