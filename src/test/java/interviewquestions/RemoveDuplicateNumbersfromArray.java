package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbersfromArray {

	public static void main(String[] args) {
		int [] array= {4,2,4,5,2,6};
		Set <Integer> dupvalue = new HashSet<Integer> ();
		for (int i=0; i<array.length;i++){
		    
		    if(dupvalue.add(array[i])== false){
		        
		        System.out.println(array[i]);
		    }
		}
	}

}
