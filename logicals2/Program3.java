package logicals2;

import java.util.Scanner;
// to find palandrome
public class Program3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int n = s.nextInt();
	int rev=0;
	int temp =n;
	do
	{
		int d = n%10;
		rev =rev*10+d;
		n=n/10;
	}
	while(n!=0);
	if(rev==temp)
		System.out.println("it is palandrome");
	else
		System.out.println("its not palandrome");
}
}
