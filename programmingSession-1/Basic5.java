package ProgrammingSession;
//printing sum of n natural numbers
import java.util.*;
public class Basic5 {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	int sum=0;
	while(n>0) 
	{
		sum=sum+n;
		n--;
	}
	System.out.println(sum);
}
}
