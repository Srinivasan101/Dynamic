package source;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int sum;
		
		while (x < 20) {
			sum = x+ y;
			System.out.println(x);
			 y = x;
			 x = sum;
		}
		
	}

}
