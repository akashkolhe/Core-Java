package patterns;

public class Program4 {
	public static void main(String[] args) {
		int n = 5;
		char ch='A';
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
			
		}
	}

}
