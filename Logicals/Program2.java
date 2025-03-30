package Logicals;

import java.util.Scanner;
// printing even number 1 to n
public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int i =1;
		while(i<=num)
		{
			if(i%2==0)
				System.out.println(i);
			i++;
			
		}
		
		for( i =1;i<=num;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}

}
