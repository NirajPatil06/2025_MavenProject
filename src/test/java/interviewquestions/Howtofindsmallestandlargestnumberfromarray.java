package interviewquestions;

public class Howtofindsmallestandlargestnumberfromarray {

	public static void main(String[] args) {

		int [] numbers= {85,91,7,98,71,57,20,38,97,6};
		int smallest = numbers[0];
		int biggest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>biggest) {
				
				biggest= numbers[i];
			}
				
			else if (numbers[i] < smallest) {
				smallest = numbers[i];
				
			}
		}
		System.out.println(smallest);
		System.out.println(biggest);
		
 	}

}
