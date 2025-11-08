package interviewquestions;

public class InterviewQuestions {

	public static void main(String[] args) {


		//1. swap 2 numbers
		
		int a = 100;
		int b = 200; // output a=200 and b=100
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping a value is: "+ a  +" " + "After swaping b value is: "+ b);
		
		
		// 2.Reverse string 
		
		//String str = "INDIA IS MY COUNTRY"
		String str = "INDIA IS MY COUNTRY";
		String rev= " ";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		   System.out.println(str.length());
	       System.out.println(rev);
	       
	       //3.Fibonacci series
	       
	       //input = first 10 numbers 
	       //output = 0 1 1 2 3 5 8 13 21 34 55
	       
	       int num1 =0;  int num2 = 1; int num =10;
	       
	       for(int i =0;i<=10;i++) {
	    	   
	    	   System.out.println(num1+ "");
	    	   int num3 = num2+num1;
	    	   num1=num2;
	    	   num2=num3;
	    	   
	       }
	       
	       //4.sum of all digit
	       //input = 987
	       //op=24
	       
	       int n =987;
	       int sum=0;
	       while(n!=0) {
	    	   
	    	   sum =sum+n%10;
	    	   n=n/10;
	       }
	       
	       System.out.println(sum);
	}

}
