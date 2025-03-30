//Design a method to print 1st five characters in reverse order.
class Reverse 
{
	public static void character (char a,char b)
	{
		while(a>=b)
		{
			System.out.println(a);
			a--;
		}
	}
	public static void main (String []args)
	{
		character('e','a');
	
	}
}
