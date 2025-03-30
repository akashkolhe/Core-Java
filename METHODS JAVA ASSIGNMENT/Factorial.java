//Design a method to find factorial of five.
class  Factorial
{
	public static void fact(int y,int z) 
	{
		int a=1;
		while(y<=z)
		{
			a=a*y;
			y++;
		}
		System.out.println(a);
	}
	public static void main(String[]args)
	{
		fact(1,5);
	
	}
}
