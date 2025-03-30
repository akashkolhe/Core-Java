package patterns3;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k =1;k<=2*i-1;k++)
			{
				System.out.print(i%2+" ");//j%2
			}
			System.out.println();
		}
	}

}
