//WAP to find product of all the even numbers which are divisible by 3 and 7 between 0 to 100
class  Divisible3
{
	public static void main(String[] args) 
	{
		int product=1;
		for (int n=1;n<=100 ;n++ )
			{
				if(n%3==0 && n%7==0)
				{	
				product=product*n;
				}
			
		}
		System.out.println(product);
	}
}
