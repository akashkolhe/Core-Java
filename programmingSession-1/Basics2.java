package ProgrammingSession;

import java.util.Scanner;

public class Basics2 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the City");
	String city = sc.next();
	String n1 = "delhi";
	String n2 = "mumbai";
	String n3 = "nagar";
	if(city.equals(n1)) 
	{
		System.out.println("Taj Mahal");
	}
	else if(city.equals(n2))
	{
		System.out.println("taj Hotel");
	}
	else if(city.equalsIgnoreCase(n3)) //We use ignore case for ignoring case sensitivity
	{
		System.out.println("Chand Bibi Mahal");
	}
	else 
	{
		System.out.println("wrong data entered");
	}
}
}
