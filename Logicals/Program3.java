package Logicals;

import java.util.Scanner;

// print odd numbers 1 to n
public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int  num= s.nextInt();
		int i =1; // initialization
		do
		{
			if(i%2!=0)
			System.out.println(i);
			i++;
		}
		while(i<=num);
		
	}

}
