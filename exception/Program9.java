package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program9 {
	public static void main(String[] args) {
		try
		{
		FileReader f = new FileReader("123.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			
			System.out.println("------------");
			e.printStackTrace();
			System.out.println("-------------");
			System.out.println(e.getMessage());
		}
	}

}
