package patterns4;

public class Program3 {
	public static void main(String[] args) {
		int n =5;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k =1;k<=star;k++)
			{
			  if(k==1||k==star)
				  System.out.print("* ");
			  else
				  System.out.print("  ");
			}
			if(i<=n/2)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
		System.out.println();
		}
	}
	}

