package Basics;

import java.util.Scanner;
 // to find even or odd using switch case
public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		
		switch (num%2) 
		{
		case 0:
			System.out.println("Even number");
			
			break;
		case 1:
			System.out.println("Odd number");
			break;


		}
		
	}

}
