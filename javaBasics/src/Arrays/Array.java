package Arrays;

public class Array {
	public static void main(String[]args) {
		
		int [] numbers = {5,6,36,44}; // array initialization
		int number1=numbers[0];       // array accessing using its index
		System.out.println(number1);  //index: 0-ist element, 1-2nd and so on...!
		
		//change an array element
		numbers[0]=18;
		System.out.println(numbers[0]);
	
		//length of array
		System.out.println(numbers.length);
		
		
	}

}
