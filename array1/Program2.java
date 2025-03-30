package array1;
// biggest element in an array
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int a []=new int[size];
		System.out.println("Enter "+size+" values ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int big=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>big)
				big=a[i];
			
		}
		System.out.println("the biggest element is array is :"+big);
	}

}
