package Basic1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		// find odd or even using arrays

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		String sc []= {"even", "odd"}; // creation array
		
		System.out.println(num+ " is a "+sc[num%2]);
		System.out.println(sc[0]);
		System.out.println(sc[1]);
	}

}
