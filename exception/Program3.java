package exception;

public class Program3 {
	public static void main(String[] args) {
		
   int a [] = {10,20,30};
   System.out.println(a[2]);
   try
   {
   System.out.println(a[3]);
   }
   catch(NullPointerException e)
   {
	   System.out.println("handled");
   }
   catch(ArithmeticException e)
   {
	   System.out.println("handled");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
	   System.out.println("INdex not present");
   }
   
	
	}

}
