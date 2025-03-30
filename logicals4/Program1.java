package logicals4;

import java.util.Scanner;
// sum of even &odd present in number
public class Program1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum1=0;
		int sum2=0;
		do
		{
			int d = n%10;
			n=n/10;
			if(n%2==0)
				sum1+=d;
			else
				sum2+=d;
		}while(n!=0);
			System.out.println(sum1);
		System.out.println(sum2);
	}

}
