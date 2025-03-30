package basics2;

import java.util.Scanner;

// to print numbers n to 1
public class Program6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		while(n>0)
		{
			
			System.out.println(n);
			n--;
		}
	}

}
