package source;

import java.util.Scanner;

public class Palindrome_Num {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int rev = 0;
		int y = x;
		
		while (x != 0) {
			rev = rev*10 + x%10;
			x = x/10;
		}
		if(y == rev) {
			System.out.println(rev + " is Palindrome number");
		}else {
			System.out.println(rev + " is Not Palindrome number");
			scan.close();
		}
		
	}
	
}

