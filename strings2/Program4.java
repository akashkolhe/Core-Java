package strings2;

import java.util.Scanner;

//palandrome
public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String ");
		String str= s.next();
		char ch[]=str.toCharArray();
		String str1="";
		for(int i =0;i<ch.length;i++)
		{
			char c = ch[i];
			ch[i]=ch[ch.length-1-i];
		    ch[ch.length-1-i]=c;	
		}
		str1 = new String (ch);
		if(str1.equalsIgnoreCase(str))
			System.out.println(" is palandrome ");
		else
			System.out.println("not palandrome");
	}

}
