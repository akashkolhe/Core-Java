package Basics;

import java.util.Scanner;

// to find smallest of three digit
public class Program5 {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter  number  ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a<b&&a<c)
		{
			System.out.println(" a is smallest :" +a);
		}
		else if (b<c)
		{
			System.out.println(" b is smallest :"+b);
		}
		else
		{
			System.out.println("c is smallest :"+c);
		}
		
		
	}

}
