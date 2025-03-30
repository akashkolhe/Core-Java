package logicals1;

import java.util.Scanner;
// finding the power of the number
public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int p =s.nextInt();
		int i =1;
		int power=1;
		while(i<=p)
		{
			power*=n; //power = power*n
			i++;
		}
		System.out.println(n+" to the power of "+p +" is "+power);
		int power1=1;
		for(int j =1;j<=p;j++)
		{
			power1 = power1 *n;
		}
		System.out.println(power1);
	}

}
