package Basics;

import java.util.Scanner;

// to check the entered month is valid month or not
class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month number");
		int month = s.nextInt();
		if (month>0&&month<=12) //true
		{
			System.out.println("it is valid month");
		}
		else// false
		{
			System.out.println("it is invalid month");
		}
	}

}
