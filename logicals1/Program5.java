package logicals1;

import java.util.Scanner;
// sum of digit present in the program
public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int sum=0;
		do
		{
			int d =n%10;
			sum+=d;
			n =n/10;
		}
		while(n!=0);
		System.out.println("the sum od digits  present is "+sum);
	}

}
