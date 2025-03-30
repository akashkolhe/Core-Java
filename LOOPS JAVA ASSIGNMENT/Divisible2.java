//WAP to count all the numbers which are not divisible by 4 and 3 between 0 to 100
class  Divisible2
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int n=0;n<100;n++)
		{
			if(n%4!=0 && n%3!=0)
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
