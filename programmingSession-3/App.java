package day1;
import java.util.Scanner;

public class App {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the values to swap:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("values before swapping for X= "+ x +" Y= "+y);
			x=x+y;
			y=x-y;
			x=x-y;
			
//			int temp=x;
//			x=y;
//			y=temp;
			System.out.println("values after swapping for X= " +x +" Y= "+y);
		}
	}

