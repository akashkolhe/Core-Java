//WAP to count all the even number between 25 to 125
class  Even2
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int n=25;n<125;n++)
		{
			if(n%2==0)
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
