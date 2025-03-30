package ProgrammingSession;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		Q6.armStrong(number);
	}
	
		public static void armStrong(int number)
		{
		int sum=0;
		int temp = number;
		do
		{
	     	int d = number%10;
		    sum =sum+d*d*d;
		    number=number/10;
		}
		while(number!=0);
		if(sum==temp)
			System.out.println("Entered number is Armstrong");
		else
			System.out.println("Number is not armstrong");
	}
	}

