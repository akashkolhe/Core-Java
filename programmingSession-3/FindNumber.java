package day1;

import java.util.ArrayList;
import java.util.Scanner;

// Nitor Coding Question -> 

public class FindNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = input.nextLine();
		input.close();
		ArrayList<String> list = getNumber(str);
		// System.out.println(list);
		int size = list.size();
		int sum = 0;
		System.out.print("identified Numbers = ");
		for (int i = 0; i < size; i++) {
			System.out.print(list.get(i) + ",");
			try {
				int num = Integer.parseInt(list.get(i));
				sum = sum + num;
			} catch (Exception e) {
				// Do nothing
			}
		}
		System.out.print("\nAverage = " + sum / size);
	}

	public static ArrayList<String> getNumber(String str) {
		ArrayList<String> list = new ArrayList<String>();
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String[] str2 = str1[i].split("");
			String sum = "";
			for (int j = 0; j < str2.length; j++) {
				try {
					int a = Integer.parseInt(str2[j]);
					sum = sum + a;
				} catch (Exception e) {
					// Do Nothing
				}
			}
			if (sum != "") {
				list.add(sum);
			}
		}
		return list;
	}
}