package ProgrammingSession;

import java.util.Scanner;

public class Q12 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter array size");
	int size = sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter "+size+ " elements in array");
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=sc.nextInt();
	}
	System.out.println("After adding elements first array is");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	int b[]=new int[a.length];
	for (int i = 0; i < b.length; i++) 
	{
		b[i]=a[i];
	}
	System.out.println("After copying element in second array");
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}
}
}
