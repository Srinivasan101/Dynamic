package source;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Number");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
	
		
		if ( x < y && y < z) {
			System.out.println("The Largest Number is : " + z);
			
		}else if (x > y && y > z) {
			System.out.println("The Largest Number is : " + x);
		}else {
			System.out.println("The Largest Number is : " + y);
			scan.close();
		}

	}

}
