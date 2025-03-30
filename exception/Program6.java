package exception;

public class Program6 {
	public static void main(String[] args) {
		
		try 
		{
			System.out.println(10/0);
		} 
		catch (Exception e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
