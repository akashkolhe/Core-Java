package ProgrammingSession;

import java.util.Scanner;
public class AverageOfArray {
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
		double sum =0.0;
		for(double a1: a)
		{
			 sum=sum+a1;
		}
		double avg= sum/a.length;
		System.out.println("Average is "+avg);
		double sum1=0.0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1+a[i];
		}
		double avg1 = sum1/a.length;
		System.out.println("Average is "+avg1);
	}
	

}
