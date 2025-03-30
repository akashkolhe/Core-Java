	q//Design a method to find addition of first five characters
class Addition 
{
	public static void Add (char a,char b)
	{
		int c=0;
		while(a<=b)
		{
			c=c+a;
			a++;
		}
		System.out.println(c);
	}
	public static void main(String []args)
	{
		Add('a','e');
		}
	}