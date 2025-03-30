package logicals3;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		for(int i =1;i<n;i++)
		{
			boolean isprime=true;
			for(int j =2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					//break;
				}
				  
			}
		
		if(isprime)
		   System.out.println(i);
          }
	}

}
