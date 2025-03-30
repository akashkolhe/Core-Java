package Exception;
// Throw keyword program -----------------------------------------
public class ThrowKeyword {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		if(a>b)
		{
			throw new ArithmeticException("Manually Thrown");
			
		}
		else
		{
			System.out.println("No Exception");
		}
	}
}
