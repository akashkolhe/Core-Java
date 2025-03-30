package ProgrammingSession;
import java.util.*;
public class Q9 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start= sc.nextInt();
		System.out.println("Enter Last Number");
		int last= sc.nextInt();
		Q9.primeInGivenRange(start,last);
	}
	public static void primeInGivenRange(int start, int last)
	{
		for (int i = start; i <= last; i++) 
		{
            if (i == 1 || i == 0)
                continue;
            	int flag = 1;
            for (int j = 2; j <= i / 2; ++j) 
            {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
