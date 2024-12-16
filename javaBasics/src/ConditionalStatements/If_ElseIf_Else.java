package ConditionalStatements;

public class If_ElseIf_Else {

	public static void main(String[] args) {
		 //Example-2-Largest of 3 numbers
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b && a >c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
