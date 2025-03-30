package array1;
// sum of array 
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		int [] a = new int[size];
		System.out.println(a.length);
		System.out.println("Enter "+size+" values to array");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum+=a[i];
			
		}
		System.out.println("the sum of the array is :"+sum);
		
				
	}

}
