import java.util.Scanner;
class prog1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int num=1;num<=n ;num++ )//outer loop is for range 
		{
			int sum = 1;
			for (int i=2;i<=num/2 ;i++ )//inner is to check perfect number or not
			{
				if (num%i==0)
				{
					sum=sum+i;
				}
				if (sum==num)
				{
					System.out.println(num+ " is perfect number");
				}
			}
		}
	}
}
