//WAP to find addition of first five even numbers
class  Add2
{
	public static void main(String[] args) 
	{
		int count=1;
		int add=0;
		for(int n=1;n<=20;n++)
		{
			if(count<=5)
			{
				if(n%2==0)
				{
					add=add+n;
						count++;
				}
			}
		}
		System.out.println(add);
	}
}