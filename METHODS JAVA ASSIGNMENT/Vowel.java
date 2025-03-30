//Design a method to check the given character is vowel or not.
class  Vowel
{
	public static void num(char a) 
	{
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		{
		System.out.println("Given character is a vowel");
		}
		else
		{
			System.out.println("Given character is consonant");
		}
	}

	public static void main(String[]args)
	{
		num('z');
	}
}
