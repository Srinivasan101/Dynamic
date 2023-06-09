package source;

public class Swap_Number {

	public static void main(String[] args) {
		
		int a = 100, b = 200;
	
		System.out.println("Adding third Value : ");
		
		int c = a+b;
		a = c-a;
		b= c-a;
		System.out.println("Result :"  + a + " " +b);
		System.out.println("Add and Sub : ");
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Result :"  + a + " " +b);
		System.out.println("Multi and Divide ");
		
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Result :"  + a + " " +b);
		System.out.println("XOR operation");
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("Result :"  + a + " " +b);
		System.out.println("Single statement");
		
		b = a+b - (a = b);
		
		System.out.println("Result :"  + a + " " +b);
		

	}

}
