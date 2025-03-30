package logicals4;

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
			int fact =1;
			while(d>1)
			{
				fact*=d;
				d--;
			}
			sum+=fact;
			n=n/10;
		}while(n!=0);
		if(sum==temp)
			System.out.println("Strong number");
		else
			System.out.println("not strong number");
	}

}
