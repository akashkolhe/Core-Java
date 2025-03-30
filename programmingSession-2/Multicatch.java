class Multicatch 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a=1;
		int b=0;
		
		
	
		try
		{
			int res=a/b;
			
		}
		catch (NullPointerException e)
		{
			System.out.println(e);

		}
		catch (ArithmeticException e)
		{
			System.out.println(e);

		}
		System.out.println("end");

		

	}
}
