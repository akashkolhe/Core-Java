class Stack1 
{
	static int a=1;
	public static void main(String[] args) 
	{
		
		System.out.println(a++);
		
		try
		{
			main(null);			
		}
		catch (StackOverflowError e)
		{
			System.out.println(e);
		}
	}
}
