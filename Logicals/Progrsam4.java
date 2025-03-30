package Logicals;

import java.util.Scanner;

public class Progrsam4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		int i=0;
		double sum = 0;
		while(i<=num)
		{
			sum=sum+i;//sum+=i;
			i++;
		}
		System.out.println("Average of n numbers is :"+sum/num);
	}

}
