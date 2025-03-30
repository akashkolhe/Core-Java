// Design a method to check the given number is positive or negative.
class  Positive
{
	public static void test(int a)
	{
		if(a>0)
		{
			System.out.println("Given number is positive");
		}
			else
				{
					System.out.println("Given number is negative");
				}
			}
		public static void main(String[]args)
		{
			test(-5);
			test(5);
	}
}
