package ProgrammingSession;

import java.util.Arrays;

public class SortingOfArray {
	public static void main(String[] args) {
		int a[]= {23,32,11,34,66,9,33};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------------");
		for (int j =a.length-1; j >=0; j--) 
		{
			System.out.println(a[j]);
		}
	}

}
