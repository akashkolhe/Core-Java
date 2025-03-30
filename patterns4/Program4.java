package patterns4;

public class Program4 {
	public static void main(String[] args) {
		int n =10;
		for(int i=1;i<=n;i++)//row
		{
			for(int j =1;j<=n;j++)//column
			{
		
			if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1||i==j||i+j==n+1)
			{
				System.out.print("* ");
			}
			else
			{
               System.out.print("  ");
			}

		}
			System.out.println();
	}
	}

}
