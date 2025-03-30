package Logicals;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  a number ");
		int num = s.nextInt();
		int fact = 1;
		while(num>0)
		{
			fact = fact*num;
			num--;
			
		}
		System.out.println("the factorial is :"+fact);
		for(int i =1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
