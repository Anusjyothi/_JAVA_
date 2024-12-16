package JumpStatements;

public class Continue {
	public static void main(String[]args) {
		for(int j=1; j<=5;j++) {
			if(j==4) {
				continue;
			}
			System.out.println(j);
		}
	}
}
