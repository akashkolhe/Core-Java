package Logicals;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	int n = s.nextInt();
	int count= 0;
	do
	{
		count++;
		n=n/10;
	}
	while(n!=0);
	System.out.println("the no of digit present in the number is :"+count);
	for(;n!=0;n=n/10)
	{
	  count++;	
	}
	System.out.println(count);
	}
}
