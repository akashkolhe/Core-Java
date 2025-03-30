package patterns1;

public class Program1 {
	public static void main(String[] args) {
		
		int n =4;
		for (int i = 0; i <n; i++)
		{
			int num=1;
			char ch ='A';
			for (int j = 0; j <n; j++) 
			{
				if(i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(num++ + " ");
				}
			}
			System.out.println();
			
		}
	}

}
