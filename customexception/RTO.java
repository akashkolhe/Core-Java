package customexception;

import java.util.Scanner;

public class RTO {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>=18)
		{
			System.out.println("get drivers lisence");
		}
		else
		{
			try
			{
				throw new InvalidAgeException("not 18 yet");
			}
			catch(InvalidAgeException E)
			{
			System.out.println(E.getMessage());	
			}
		}
	}

}
