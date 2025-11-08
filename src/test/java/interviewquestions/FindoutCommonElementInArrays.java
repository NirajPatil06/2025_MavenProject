package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindoutCommonElementInArrays {

	public static void main(String[] args) {
		//  Find out Common Element InArrays 
		//using retainAll Method
		
		Integer [] array1= {4,2,3,1,6};
		Integer  [] array2= {6,7,8,4};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2));
		list1.retainAll(list2);
		System.out.println("Common Elements" + list1);
		

	}

}
