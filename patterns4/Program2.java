package patterns4;

public class Program2 {
	public static void main(String[] args) {
	int n =5;
	int star=n;
	int space=0;
	for(int i=1;i<=n;i++) // row
	{
		for(int j =1;j<=space;j++)//space
		{
			System.out.print("  ");
		}
		for(int k =1;k<=star;k++)//star
		{
			System.out.print("* ");
		}
		if(i<=n/2)//decreasing of star
		{
			space++;
			star=star-2;
		}
		else
		{
			space--;
			star=star+2;
		}
	System.out.println();
	}
}

}
