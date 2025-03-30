package ProgrammingSession;
import java.util.Scanner;
public class Basic4 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Value");
	int p = sc.nextInt();
	String tax = p>=1000000?"Tax : 20%" :(p>500000&&p<100000)?"tax : 15%":(p<500000)?"tax :10%":"Invalid Option ";
	System.out.println(tax);
}
}
