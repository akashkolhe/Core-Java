package ProgrammingSession;
import java.util.*;
public class Q11 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n, index, element;
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		int a[]= new int[size+1];
		System.out.println("Enter "+size+"elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	    
		System.out.println("Enter the position where you want to insert element:");
		index = sc.nextInt();
		 System.out.println("Enter the element you want to insert:");
		 element = sc.nextInt();
		  for(int i = a.length-1; i >= (index-1); i--)
		  	{
		       a[i+1] = a[i];
		     }
		      a[index-1] = element;
		      System.out.print("After inserting:");
		       for(int i = 0; i < size; i++)
		         {
		             System.out.print(a[i]+",");
		         }
		         System.out.print(a[size]);
		     }
		 }

