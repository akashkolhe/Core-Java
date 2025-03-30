package patterns;

public class Program5 {
	public static void main(String[] args) {
		int n =4;
		for (int i = 0; i < n; i++) 
		{
			int num=1; // for column only
			for (int j = 0; j < n; j++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
			
		}
	}

}
