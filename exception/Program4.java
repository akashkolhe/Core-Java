package exception;

public class Program4 {
	public static void main(String[] args) {
		String s = "core java";
		System.out.println(s.charAt(5));
		try 
		{
			System.out.println(s.charAt(99));
		}
	   catch(NullPointerException e)
		{
			System.out.println("handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
		catch (Exception e) 
		{
		  System.out.println("super class exception");
		}
		
		

	}

}
