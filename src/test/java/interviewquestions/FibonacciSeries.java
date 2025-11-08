package interviewquestions;

public class FibonacciSeries {

	public static void main(String[] args) {


		// take 1 to 10 number
		//Fibonacci series
	       
	       //input = first 10 numbers 
	       //output = 0 1 1 2 3 5 8 13 21 34 55
		
		  int num1 = 0;
		  int num2= 1;
		  int num = 10;
		  
		  for(int i=0;i<=num;i++) {
			  System.out.println(num1+ " " );
			  int num3=num2+num1;
			  num1=num2;
			  num2=num3;
			  
			  
		  }
		  
		 
		
		
	}
	

}
