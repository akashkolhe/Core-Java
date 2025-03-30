package strings1;
import java.util.Scanner;
//finf number splecialcharacters &alphabets in a string
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eNTER A STRING");
		String s =sc.next();
		int uppercase=0;
		int lowercase=0;
		int spl=0;
		int digit=0;
		char ch;
		for (int i = 0; i <s.length(); i++) {
			ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
				uppercase++;
			else if (ch>='a'&&ch<='z')
				lowercase++;
			else if(ch>='0'&&ch<='9')
				digit++;
			else
				spl++;
	    }
		System.out.println("The number of uppercase  : "+uppercase);
		System.out.println("The number of lowercase : "+lowercase);
		System.out.println("The number of spl : "+spl);
		System.out.println("The number  of digit: "+digit);
	}

}
