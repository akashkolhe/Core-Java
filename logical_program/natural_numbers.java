package logical_program;

import java.util.Scanner;

public class natural_numbers {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter any number that you want :- ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			
			System.out.println(i);
		}
	}
}
