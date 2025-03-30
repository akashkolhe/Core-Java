package programmingSession1;

import java.util.Scanner;

public class Q2 
{
	public static void main(String[] args) 
	{
	  
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Find biggest in 5 Numbers");
	 int a[]=new int[5];
	 System.out.println("Enter 5 elements");
	 for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int largest=a[0]; 
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]>largest)
		largest= a[i];
	}
	System.out.println("Largest Element is "+largest);
}
}
