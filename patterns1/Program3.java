package patterns1;

public class Program3 {
	public static void main(String[] args) {
		int n=4;
		int num=1;
		char ch='A';
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print(num++ + " ");
				    ch++;
				}
				else
				{
					System.out.print(ch++ + " ");
					num++;
				}
			}
			System.out.println();
		}
	}

}
