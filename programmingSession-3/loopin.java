import java.util.Scanner;
class loopin
{
	public static void main(String [] args)

		Scanner s = new Scanner(System.in);

	System.out.println("enter start no");
	int no=s.nextInt();

	System.out.println("enter end no");
	int n1=s.nextInt();

	while(int no<=n1)
	{
		System.out.println(no);
		no++;
	}

}