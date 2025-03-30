package ProgrammingSession;
//Printing numbers from 1 to entered number
import java.util.Scanner;
public class Basics3
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number");
	int n= sc.nextInt();
	int i=1;
	
	while(i<=n) 
	{
		System.out.println(i);
		i++;
    }
}
}