package logicals4;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum=1;
		int temp =n;
		for(int i =2;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==temp)
			System.out.println("is prefect number");
		else
		System.out.println("not prefect number");
	}

}
