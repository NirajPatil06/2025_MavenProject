package interviewquestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		// a =100 and b=200 swap this two numbers
		
		int a=100;
		int b =200;
		int temp = a;
		
		a=b;
		b=temp;
		System.out.println("The value of a is: " + a + "  and b = "+b);
		
		//swap of two numbers without using temp variable
		
		String a1 = "Hello";
		String b1 = "World";
		
		a1= a1+b1;
		System.out.println(a1);
		
		b1= a1.substring(0, a1.length()-b1.length());
		System.out.println(b1);
		
		a1 = a1.substring(b1.length());
		
		System.out.println("After swaping a1 and b1 value is " + a1 + " "+ b1);
		
	}

}
