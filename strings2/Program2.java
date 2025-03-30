package strings2;

import java.util.Scanner;

// convert lowercase to uppercase viceversa
public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter a string");
		String str= s.nextLine();
		char []c=str.toCharArray();
		for(int i = 0;i<c.length;i++)
		{
			if(c[i]>=65&&c[i]<=90)
			{
				c[i]=(char)(c[i]+32);
			}
			else if(c[i]>=97&&c[i]<=122)
			{
				c[i]=(char)(c[i]-32);
			}
		}
		str=new String(c);
		System.out.println(str);
	}

}
