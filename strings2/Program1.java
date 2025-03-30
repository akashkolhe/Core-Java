package strings2;

import java.util.Scanner;

// find sum of alphanumeric in string
public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.next();
		char []ch=str.toCharArray();
		int j =0;
		for(int i =0;i<ch.length;i++)
		{	
			if(ch[i]>=48&&ch[i]<=57)
			{
				j+=ch[i]-48;
			}
		}
	System.out.println(j);
	}

}
