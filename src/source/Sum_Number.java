package source;

import java.util.Scanner;

public class Sum_Number {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		
		int sum = 0; 
		
		while(x != 0) {
			sum += x%10;
			x = x/10;
		}
		System.out.println ("Sum of the number is : " + sum);

	}

}
