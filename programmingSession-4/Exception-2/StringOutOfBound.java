package Exceptions;

public class StringOutOfBound {
public static void main(String[] args) {
	String s= "akash";
	try 
	{
		for (int i=0;i<=s.length();i++)	
		{
			System.out.print(s.charAt(i));
		}
	}
		catch(StringIndexOutOfBoundsException  e)
	{
		System.out.println("  ");
		System.out.println("Exception Handled");
	}
	}
}
