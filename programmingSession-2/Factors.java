class Factors
{
	public static void main(String[] args)
	{
		int res = Fact(29);
		System.out.println("THE NUMBER FACTORS ARE "+res);
	}
       public static int Fact(int num)
	{
		int a = 0;
		for(int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				a++;
				
			}
		}
		return a;
	}
}
