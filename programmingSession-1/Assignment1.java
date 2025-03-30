package programmingSession1;
import java.util.*;
public class Assignment1 
{
	public static void main(String[] args) 
	{
	   System.out.println("Even odd using if else");
	   System.out.println("Enter the number");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   if(num%2==0)
		   System.out.println(num+ " is Even");
	   else
		   System.out.println(num+ " is odd");
	   System.out.println();
	   
	   
	   System.out.println("Using Switch");
	   System.out.println("Enter the number");
	   int num1= sc.nextInt();
	   switch(num%2) {
	   case 0:
		   System.out.println(+num1+ "  is odd");
		   break;
	   case 1 :
		   System.out.println(+num1+ "  is Even");
		   break;
	}
	   
	 System.out.println("Using array");
	 System.out.println("Enter size of array");
	 int size = sc.nextInt();
	 int a[]=new int[size];
	 System.out.println("Enter" +size+ " elements");
	 for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Even numbers in array are");
	for (int j = 0; j < a.length; j++) 
	{
		if(a[j]%2==0)
			System.out.println(a[j]);
	}
	System.out.println("odd Numbers in array");
	for (int j2 = 0; j2 < a.length; j2++) 
	{
		if(a[j2]%2!=0)
			System.out.println(a[j2]);
	}
	}

}

