package array1;
// reverse  a array
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size= s.nextInt();
		String name []= new String[size];
		System.out.println("enter "+size+" name to array");
		for (int i = 0; i < name.length; i++) 
		{
			name[i]=s.next();
		}
		System.out.println("name is reverse order");
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
				
	}

}
