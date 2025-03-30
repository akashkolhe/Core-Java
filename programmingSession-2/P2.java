class P2 extends P1 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");

		Object obj=new Object();
		System.out.println(obj);
		P1 obj1=new P1();
		System.out.println(obj1);
		System.out.println(obj1.a);
		
		
		
		try
		{
			P2 a=(P2)obj;
		}
		catch (ClassCastException e)
		{
			System.out.println(e);        
		}
		System.out.println("end");
	}
}
