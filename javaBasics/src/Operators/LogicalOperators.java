package Operators;

public class LogicalOperators {
	public static void main(String[]args) {
		
		// '&&' -->Logical and operator
		
		int a=1;
		int b=2;
		int c=1;
		System.out.println(a < b  && a==c); //returns true.
											//Reason: (true && true)-->true
		
		System.out.println(a > b && a==c);  //returns false.
											//Reason: (false && true)-->false
		
		System.out.println(a==c && b < c);  //returns false.
											//Reason: (true && false)-->false
		
		System.out.println(a==c && b > c);  //returns true.
											//Reason: (true && true) -->true
		
		System.out.println(" ");//space
		
		// '||' -->Logical or operator
		
	    System.out.println(a==c || a>b); //if any one is true the result is true
	    System.out.println(a!=c || a>b); //if both are false the result is false
	    System.out.println(a==c || a<b); //if both are true, the result is true
	    
	    System.out.println();
	    
	    // '!' -->Logical not operator // it just gives opposite of the result
	    
	    System.out.println(!(a==c || a>b)); //actually it is true but due to '!' the result becomes false
	    
		 
		
	}

}
