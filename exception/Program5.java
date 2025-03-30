package exception;

public class Program5 {
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("--------");
			System.out.println(e.getMessage());
		}
		int a []= {10,20,30};
		try {
			System.out.println(a[99]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
