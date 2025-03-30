package strings;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a STRING");
		String str1 = s.next();
		String str2="";
		for (int i = 0; i < str1.length(); i++) 
		{
			str2=str1.charAt(i)+str2;
		}
		System.out.println(str2);
		System.out.println("-------");
		for(int i =str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		System.out.println("---------");
		StringBuilder sb= new StringBuilder(str1);
		System.out.println(sb.reverse());
	}

}
