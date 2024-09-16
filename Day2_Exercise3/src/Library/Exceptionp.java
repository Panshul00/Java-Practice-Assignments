package Library;

import java.util.Scanner;

public class Exceptionp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		try {
			int c=a/b;
			System.out.println("This is (c=a/b)   =  "+c);
		}
		catch(ArithmeticException e) {
			if(e.getMessage().equals("/ by zero"))
				throw e;
			else
				throw e;
		}
		finally {
			System.out.println("Bye");
		}
		
		

	}

}
