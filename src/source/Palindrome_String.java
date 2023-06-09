package source;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String pro = scan.nextLine();
		String x = pro;
		int len = pro.length()-1;
		
		String rev ="";
		
		for (int i = len ; i >= 0 ; i--) {
			
			rev = rev + pro.charAt(i);
		}
	
		if (x.equals(rev)) {
			System.out.println(rev + " is Palindrome String");
		}else {
			System.out.println(rev + " Not a Palindrome String");
		}
	

		// String buffer and builder not working in palindrome string

	}

}