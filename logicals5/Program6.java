package logicals5;

import java.util.Scanner;

public class Program6 {
	 public  static int smallest(int x , int y ,int z)
	{
		int res=(x<y&&x<z)?x:(y<z)?y:z;
		return res;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int small = smallest(a,b,c);
		System.out.println(small);
	}

}
