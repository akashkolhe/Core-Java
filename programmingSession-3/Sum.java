package day1;

import java.util.Scanner;

class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int temp = num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println("Sum of the digits from the number is = " + sum);
	}
}