package interviewquestions;

public class ReverseString {

	public static void main(String[] args) {

//using for loop
		String str = "Niraj";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		// Using StringBuffer Class
		String surName = "Patil";
		StringBuffer sbf = new StringBuffer(surName);
		sbf.reverse();
		System.out.println(sbf);
		
		//using String Builder 
		String reverse = "INDIA IS MY COUNTRY";
		StringBuilder sbd = new StringBuilder(reverse);
		sbd.reverse()	;
		System.out.println(sbd);
		
		
		
		}

}
