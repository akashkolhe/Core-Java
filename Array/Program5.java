package Array;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
	
	Scanner  s = new Scanner(System.in);
	System.out.println("enter the size of the array ");
	int size = s.nextInt();
     
	String  []name = new String[size];
	System.out.println("enter the data to the array");
	for (int i = 0; i < name.length; i++)
	{
		name[i]=s.next();
	}
	System.out.println("----------");
	System.out.println("Enter elements are ");
	for(String  n: name)
	{
		System.out.println(n);
	}
	}

}
