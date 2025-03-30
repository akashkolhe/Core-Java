package basics2;

import java.util.Scanner;
// enter the city find famous monument present
public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the city");
		String city = s.next();
		String c1 ="dehli";
		String c2 ="agra";
		String c3 ="jaipur";
		if (city.equals(c1))
		{
			System.out.println("red fort");
		}
		else if(city.equals(c2))
		{
			System.out.println("taj mahal");
		}
		else if (city.equals(c3))
		{
			System.out.println("jai mahal");
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
