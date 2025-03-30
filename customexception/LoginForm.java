package customexception;
import java.util.Scanner;
 class LoginForm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the user id :");
		String id = s.next();
		System.out.println("Enter the password :");
		int password = s.nextInt();
		if(id.equals("tom"))
		{
			if(password==12345)
			{
				System.out.println("Login successfull");
			}
			else
			{
				try
				{
InvalidPasswordException e = new InvalidPasswordException();
				throw e;
				}
				catch(InvalidPasswordException E)
				{
					System.out.println("Invalid password ");
				}
			}
		}
	}

}
