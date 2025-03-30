package ProgrammingSession;
import java.util.Scanner;
//Armstrong Number
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	int sum=0;
	int temp = n;
	do
	{
     	int d = n%10;
	    sum =sum+d*d*d;
	    n=n/10;
	}
	while(n!=0);
	if(sum==temp)
		System.out.println("Entered number is Armstrong");
	else
		System.out.println("Number is not armstrong");
}
}