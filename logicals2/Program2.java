package logicals2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n = s.nextInt();
		int sum=0;
		int temp=n;
		do
		{
			int d =n%10;
			sum+=d*d*d;//sum=sum+d*d*d;
			n=n/10;
		}
		while(n!=0);
		if(sum==temp)
		System.out.println("this number is armstrong");
		else
		System.out.println("the number is not armstrong");
	}

}
