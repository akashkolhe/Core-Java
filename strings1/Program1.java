package strings1;

import java.util.Scanner;

//count number of character in string
public class Program1 {
	public static void main(String[] args) {
		int count =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = s.nextLine();
		char ch[]=st.toCharArray();
		System.out.println(ch[1]);
		for(int i =0;i<ch.length;i++)
		{

			
if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122||ch[i]>=48&&ch[i]<=57&&ch[i]!=32&&ch[i]!=','&&ch[i]!='.')
				count++;
				
		}
		System.out.println("No of characters are : "+count);
	}

}
