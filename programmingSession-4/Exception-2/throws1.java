package Exceptions;
//throws keyword -------
public class throws1 {
	
	public static void main(String[] args) throws InterruptedException,ArithmeticException
	{
			for(int i=1;i<=5;i++)
			{
			System.out.println(i);
			Thread.sleep(500);
			}
			
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("Value of C"+c);
	}

	}