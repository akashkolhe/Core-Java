//Design a method to check given character is uppercase or lowercase
class  Uppercase
{
	public static void demo(int c) 
	{
		if(c>=97 && c<=127)
		{
			System.out.print("Given character is lowercase");
		}
		else if(c>=65 && c<=90)
		{
			System.out.println("Given character is uppercase");
		}
	}
	public static void main(String[]args)
	{
		demo('A');
		demo('a');
	}
}
