package logicals3;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int n =s.nextInt();
	int i;
	if(n==1)
	{
		System.out.println("prime starts from 2");
	}
	for(i =2;i<n;i++)
	{
		if(n%i==0)
		{
			 System.out.println("not a prime");
		    break;
		}
    }
	if(n==i)
		System.out.println("prime");

}
}