import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int sum=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
System.out.println(i);
			}
		}
		
	}
}
