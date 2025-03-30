import java.util.Scanner;
class marks 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Your Marks");
		double d = s.nextDouble();
			if(d>=80  d<=100)
			{
				System.out.println("Congratulations....You Got A Distinction...");
			}
		else if (d>=60 && d<=79)
			{
				System.out.println("Congratulations....You Got A First Class...");
			}
		else if (d>=35 && d<=59)
			{
				System.out.println("Congratulations....You are pass...");
			}
		else
		{
			System.out.println("you are fail");
		
		}

	}
}
