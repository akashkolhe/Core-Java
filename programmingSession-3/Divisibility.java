package day1;

import java.util.Scanner;

public class Divisibility {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%11==0 && num%17==0)
		{
			System.out.println("Foo Bar");
		}
		else if(num%17==0)
		{
			System.out.println("Bar");
		}
		else if(num%11==0)
		{
			System.out.println("Foo");
		}
		else
		{
			System.out.println("number is neither divisible by 11 nor 17");
		}
	}
}

