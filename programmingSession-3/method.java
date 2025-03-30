class method  
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test();
		System.out.println("end main");
	}
	
	public static void m1() 
	{
		System.out.println("from m1");
		
	}
	public static void test() 
	{
		System.out.println("from test");
		m1();
		
	}
}
