package logicals2;

import java.util.Scanner;

// reverse a number
public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n = s.nextInt();
		int rev=0;
		do {
			int d = n%10;
			rev=rev*10+d;
			n= n/10;
		}
		while(n!=0);
		System.out.println(rev);
	}

}
