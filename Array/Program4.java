package Array;

import java.util.Scanner;

public class Program4 {
public static void main(String[] args) {
	Scanner  s = new Scanner(System.in);
	System.out.println("enter the size of the array ");
	int size = s.nextInt();
	int  []a = new int[size];
	System.out.println("enter the data to the array");
	for (int i = 0; i < a.length; i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("----------");
	System.out.println("Enter elements are ");
	
	for(int num: a)
	{
		System.out.println(num);
	}
			
	
}
}
