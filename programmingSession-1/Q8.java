package ProgrammingSession;
import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		Q8.palindrome(num);
	}
	public static void palindrome(int num)
	{
		int sum=0;
		int temp=num;
		do
		{
			int d = num%10;
			sum= sum+d*d*d;
			num=num/10;
		}while(num!=0);
		
			if(sum==temp)
				System.out.println(+temp+ " is Palindrome");
			else
				System.out.println(+temp+" is not palindrome");
	}

}
