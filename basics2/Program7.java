package basics2;

import java.util.Scanner;
// find the sum of n natural number
public class Program7 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n;//sum=sum+n
			n--;
		}
		System.out.println(sum);
	}

}
