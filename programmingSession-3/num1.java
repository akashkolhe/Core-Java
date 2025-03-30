import java.util.Scanner;

class num1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a starting number");
         int start=s.nextInt();
		 System.out.println("Enter a ending number");
         int end=s.nextInt();
		 while (start<=end)
		 {
			 if (start%3==0 && start%5==0)
			 {
				 System.out.println(start); 
			 }
			 start++;
		 }

		
	}
}
