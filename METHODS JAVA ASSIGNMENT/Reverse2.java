//Design a method to print 1st five odd numbers in reverse order
class  Reverse2
{
	public static void Odd(int a,int b) 
	{
		while(a>b)
		{
			if(a%2!=0)
			{
					System.out.println(a);
			}
			a--;
		}
	}
	
	public static void main(String[]args)
	{
		Odd(10,0);
	}
}


