//Design a method to find summation of all the numbers which are divisible by 3 and 7 between 0 to 100.
class  Summation
{
	public static void add(int a,int b) 
	{
		int res=0;
		while(a<=b)
		{
			if(a%2==0 && b%2==0)
			{
				res=res+a;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		add(1,100);
	}

}

