package ProgrammingSession;
import java.util.Scanner;

public class Basics1 
{
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int num= sc.nextInt();
	if(num%2==0 && num%5==0)
	{
		System.out.println("FIZZ and BUZZ");
	}
	else if(num%2==0)
	{
		System.out.println("FIZZ");
	}
	else if(num%5==0) 
	{
		System.out.println("Buzz");
	}
	else {
		System.out.println("Wrong data Entered");
	}
}
}
