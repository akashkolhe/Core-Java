import java.util.Scanner;
class digit  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int digits;
		
		for (digits=0;num>0 ;num=num/10 )
		{
			digits++;
		}
		System.out.println(digits);
	} 
}



