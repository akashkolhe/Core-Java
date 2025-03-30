package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program12 {
	void readData() throws FileNotFoundException
	{
		FileReader f = new FileReader("123.txt");
	}
	public static void main(String[] args) {
		Program12 p = new Program12();
		try
		{
		p.readData();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}

}
