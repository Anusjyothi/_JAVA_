package Operators;

public class ArithmeticOperators {
	public static void main(String[]args) {
		int a=20;
		 int b=10;
		 
	     int sum=a+b;	 //addition
		 System.out.println(sum);
		 
		 int subtraction=a-b;   //subtraction
		 System.out.println(subtraction);
		 
		 int multiplication=a*b; //multipliaction
		 System.out.println(multiplication);
		 
		 float f1=5;
		 float f2=3.5f;
		 
		 float divsion=f1/f2; //divison
		 System.out.println(divsion);
		 
		 int remainder =a % b; //modulus finding remainder
		 System.out.println(remainder);
		 
		 //Increment and Decrement operators:
		 
		 int w=11;   
		 w++; // post-increment operator :--->means w= w+1 (1 is added to the number)
		 System.out.println(w);
		 
		 //Now, pre-increment operator
		 ++w; //---> It is also the same 1 is added to w. So, now w becomes
		 System.out.println(w);
		 
		 //Similarly pre and post decrement operators where 1 is subtracted from the number:-
		 int x=50;
		 --x; //pre-decrement
		 System.out.println(x);
		 
		 x--; //post-decrement
		 System.out.println(x);
		 
		 //	But you might ask both pre and post purpose is one then why both  post and pre exist. Yes thats true
		 // Both are same in purpose but difference is there. Lets see..! and its very Impt
		 // This is a java interview question (VERY VERY IMPT)
		 
		 int c=5;
		 System.out.println(++c); //Here the ouput=6. as on printing it traverse from left to right.
		 						  // and here ++ is given 1st priority so the number is incremented and get stored in c itself.
		 						// so then from '++' to 'c', now c so it prints c thus gives incremented output=6
		 
		 int d=2;
		 System.out.println(d++);//here the output=2. But why..? Relax..!
		 						 // as from left to right,the 1st priority given to 'd' and then to '++'. So first it prints c thus we get output=2 itself no change
		                         //But the number do change or increments after printing only
		 						//can we check is that number changed after printing or not..?
		 
		 System.out.println(d); //Now you could see it is actually incremented
		 
		 
	}

}
