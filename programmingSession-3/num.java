import java.util.Scanner;
class num 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int count=1;
		for(int i=1;i<=num;i++)
		{
			count=count+1;
		}
			System.out.println(count);
	}
}
