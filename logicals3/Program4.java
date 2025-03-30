package logicals3;

import java.util.Scanner;
// no prime number contain in no
public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enTER THE NUMBER");
		int n = s.nextInt();
		int count=0;
		do
		{
			int i =n%10;
			n/=10; // n=n/10;
			if(i==2||i==3||i==5||i==7)
				count++;
		}
		while(n!=0);
		System.out.println(count);
	}

}
