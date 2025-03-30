package basics2;

import java.util.Scanner;
// print numbers from 1 to n
public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i =1; // initialization
		
		while(i<=n) // condition
		{
			System.out.println(i);
			i++; // updation
		}
		System.out.println("--------------");
		for(int  j=1 ;j<=n;j++)
		{
			System.out.println(j);
		}
	}

}
