package day1;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values to swap");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("values before swapping for X: "+ x + " for Y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("values after swapping for X: " +x + " for Y: "+y);
	}
}
