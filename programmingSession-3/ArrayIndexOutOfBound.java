package Exception;

public class ArrayIndexOutOfBound {
	
		public static void main(String[] args) {
			int a[]= {10,20,30};
			try {
				System.out.println(a[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("exception handled");
			}   
		}
		}