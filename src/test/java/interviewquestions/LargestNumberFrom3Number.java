package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberFrom3Number {

	public static void main(String[] args) {
		// 18,88,188 find out largest number from three numbers
		
		List<Integer> largNumber = new ArrayList <Integer>();
		largNumber.add(18);
		largNumber.add(88);
		largNumber.add(188);
		System.out.println(Collections.max(largNumber));
		

	}

}
