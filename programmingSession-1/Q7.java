package ProgrammingSession;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		int n = sc.nextInt();
		Q7.strongNumber(n);
	}
		public static void strongNumber(int n)
		{
		int total = 0;
		int temp_n = n;
		while(n != 0)
		{
		int i = 1;
		int fact_n = 1;
		int lastdig = n % 10;
		while(i <= lastdig)
		{
			fact_n = fact_n * i;
			i++;
		}
			total = total + fact_n;
			n = n / 10;
		}
		if(total == temp_n)
		System.out.println(temp_n + " is a strong number\n");
		else
		System.out.println(temp_n + " is not a strong number\n");
		System.out.println();
	}
}

