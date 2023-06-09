package source;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int pro = scan.nextInt();
		int tech = scan.nextInt();
		
		int rev = 0;
		 while(num != 0) {
			 rev = rev*10 + num%10;
			 num = num/10;
		 }
		 System.out.println("After Swap : " + rev);
		 
		 StringBuffer fb = new StringBuffer (String.valueOf(pro));
		 StringBuffer num_rev = fb.reverse();
		 System.out.println(num_rev);
		
		StringBuilder build = new StringBuilder();
		build.append(tech);
		StringBuilder result =build.reverse();
		System.out.println(result);
		
		scan.close();
	}

}

