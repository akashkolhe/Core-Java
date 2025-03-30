class StrE 
{
	public static void main(String[] args) 
	{
		String s1="Nishant";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		
			
		try
		{
			System.out.println(s1.charAt(7));
			
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(e);

		}
		finally
		{
			System.out.println("finally block is executed");
		}

		System.out.println(2);			
	}
}
