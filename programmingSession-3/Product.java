//Design a method to find product of 1st five even numbers.
class  Product
{
	public static void Prod(int a,int b) 
	{
	int c=1;
		while(a<=b)
		{
			if(a%2==0)
			{
			c=c*a;
			}
			a++;
		}
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		Prod(1,10);
	}
}


