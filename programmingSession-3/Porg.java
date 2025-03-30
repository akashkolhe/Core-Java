import java.util.Scanner;
class Porg
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=s.nextInt();
		System.out.println("Enter the ending number");
		int end=s.nextInt();
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(i%7==0)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
