import java.util.Scanner;
public class Occurance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:-");
		String str =sc.next();
		
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			count=0;
			char ch=str.charAt(i);

			for(int j=0;j<str.length();j++)
			{
				char c = str.charAt(j);
				if(j<i && ch==c)
				{
					break;
				}
				if(ch==c)
				{
					count++;
				}
			}
			if(count!=0)
			
			System.out.println("character "+ch+" count is= "+count);

		}
			

	}

}