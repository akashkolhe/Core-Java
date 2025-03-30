package exception;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		System.out.println("main start");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = s.nextInt();
		System.out.println("Enter b :");
		int b = s.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divde zero");
		}
		System.out.println("main end");
	}

}
