package Basic1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		String res = age>=21?"marry soon":"have patiance";
		System.out.println(res);
	}

}
