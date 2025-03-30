package basics2;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		
		if(n%3==0 && n%5==0)
		{
			System.out.println("FIZZ AND BUZZZ");
		}
		else if(n%5==0)
		{
			System.out.println("BUZZ");
		}
		else if (n%3==0)
		{
			System.out.println("fizz");
		}
		else
		{
			System.out.println("not divisible by 3 and 5");
		}
	}

}
