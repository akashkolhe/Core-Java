import java.util.Scanner;
class looping1
{
	public static void main(String[] args) 
	{
	 	Scanner s =new Scanner (System.in);
		System.out.println("Enter a starting number");
		int start = s.nextInt();
        System.out.println("Enter a ending number");
		int end = s.nextInt();
		while (start<=end)
		{
			System.out.println(start);
			start++;
		}
	}
}
