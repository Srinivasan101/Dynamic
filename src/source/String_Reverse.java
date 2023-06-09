package source;

public class String_Reverse {

	public static void main(String[] args) {
		
		String str ="Srini";
		String rev = "";
		int len = str.length()-1;
		
		// STEP 1
		
		/*for ( int i = len ; i>=0; i--) {
			rev = rev + str.charAt(i);
		}*/
		
		// STEP 2
		
		/*char pro [] = str.toCharArray();
		for ( int i = len ; i>=0; i--) {
			rev = rev + pro[i];
		}*/
		
		//STEP 3
		
		/*StringBuffer pro = new StringBuffer(str);
		StringBuffer prime =pro.reverse();

		System.out.println(prime);*/
		
		StringBuilder prime = new StringBuilder();
		prime.append(str);
		StringBuilder pro = prime.reverse();
		System.out.println(pro);
		
	}

}
