package Basics;

import java.util.Scanner;
 // to find even or odd using if else 
public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();  // dynamic code
		
	 //int num = 99; // hard code
	
	if(num%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
}
}
