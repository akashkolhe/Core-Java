package ProgrammingSession;

import java.util.Scanner;

public class BigInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter  " + size + " elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int big=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>big)
				big=a[i];
		}
		System.out.println("Biggest array member is  " + big);
		}

}
