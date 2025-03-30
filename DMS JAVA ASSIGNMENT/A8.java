class A8 
{
	public static void main(String[] args) 
	{
		int physics=38;
		int chemistry=67;
		int maths=84;
		int biology=95;
		int percentage=71;
		if(physics<35 || chemistry<35 || maths<35 ||biology<35)
		{
			System.out.println("fail");
		}
		else if(percentage>=80)
		{
			System.out.println("distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("first class");
		}
		else if (percentage>=50)
		{
			System.out.println("pass");
		}

	}
}
