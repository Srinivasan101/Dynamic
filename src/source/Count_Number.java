package source;

import java.util.Scanner;

public class Count_Number {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		
		int rev = 0; int count = 0;
		
		while(x != 0) {
			rev = rev*10 + x%10;
			x = x/10;
			count++;
		}
		
		System.out.println(" Number of the count is "+ count);
		scan.close();
	}

}
