package patterns1;

public class Program4 {
public static void main(String[] args) {
	int n =4;
	int enum1=2;
	int onum=3;
	for(int i =0;i<n;i++)
	{
		for(int j =0;j<n;j++)
		{
			if(i%2==0)
			{
				System.out.print(enum1+" ");
				enum1+=2;// ENUM=ENUM+2
			}
			else
			{
				System.out.print(onum+" ");
				onum+=3;//ONUM=ONUM+2
			}
		}
		System.out.println();
	}
	}
}

