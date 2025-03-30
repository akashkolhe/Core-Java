package Exception;
//ARITHMETIC EXCEPTION ----------
public class Arithmetic {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("exception handled for arithmetic");
		}
//		finally 
//		{
//			System.out.println("Finally Block get Executed");
//		}
//		System.out.println("Normal flow Continues");
	}
	}