package Array;

public class Program3 {
	public static void main(String[] args) {
		
		double [] bal= {1.2,3.4,5.6,7.8,9.9};
		for (int i = 0; i < bal.length; i++)
		{
			System.out.println(bal[i]);
		}
		
		System.out.println("----------");
		for(double d : bal)
		{
			System.out.println(d);
		}
		System.out.println(bal[99]);
		try
		{
		System.out.println(bal[99]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index not present");
		}
		
	}

}
