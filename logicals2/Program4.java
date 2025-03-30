package logicals2;

import java.util.Scanner;

// fibonnaci series
public class Program4 {
	public static void main(String[] args) {
		int i1=0;
		int i2=1;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter series length");
		int count=ss.nextInt();
		System.out.println(i1);
		System.out.println(i2);
		for(int i =1;i<=count;i++)
		{
			int i3=i1+i2;
			System.out.println(i3);
			i1=i2;
			i2=i3;
		}
	}

}
