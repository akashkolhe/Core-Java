package strings1;
import java.util.Scanner;
// verify u entered correct paswword
public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A password");
	     String pwd=s.next();
	     int uppercase=0;
	     int lowercase=0;
	     int digit=0;
	     int spl_char=0;
	     for(int i=0;i<pwd.length();i++)
	     {
	    	 char ch= pwd.charAt(i);
	    	 if(ch>='A'&&ch<='Z')
	    		 uppercase++;
	    	 else if(ch>='a'&&ch<='z')
	    		 lowercase++;
	    	 else if(ch>='0'&&ch<='9')
	    		 digit++;
	    	 else
	    		 spl_char++;
	     }
	   if(pwd.length()>=8&& uppercase>0&&lowercase>0&&digit>0&&spl_char>0)
		   System.out.println("Entered valid password");
	   else
		  System.out.println("Enter in valid pawssword ");
    }
	}


