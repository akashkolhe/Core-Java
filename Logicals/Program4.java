package Logicals;

import java.util.Scanner;
// sum of even numbers upto n
public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int i =0;
		double sum = 0;
		while(i<=num)
		{
			if(i%2==0)
				sum+=i;//sum=sum+i;
			i++;
		}
		
		System.out.println("average of even numbers is  : "+sum/(num/2));
	}

}
