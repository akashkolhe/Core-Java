import java.io.*;
class FileE 
{
	public static void main(String[] args)
	{
		
		try
		{
			FileOutputStream obj=new FileOutputStream("C:\\MK\\abcd.txt");
			

		}
		catch (FileNotFoundException e)
		{
			System.out.println(e); 
		}
		System.out.println("Created");
	}
}
