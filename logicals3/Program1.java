package logicals3;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n = s.nextInt();
		int count=0;
		int i =1;
		while(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
		{
			System.out.println("its prime");
		}
		else
		{
			System.out.println("it not prime");
		}
		int b = 3%1;
		System.out.println(b);
		int c =3%2;
		System.out.println(c);
	}

}
