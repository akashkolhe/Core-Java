import java.util.Scanner;
class switch1
{
	public static void main(String [] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a month");
		String month=new S.next();
		System.out.println("Enter a year");
		String year=new s.next();
		switch (month)
		switch (year)
		{
		case"jan":
			case"mar":
			case"may":
			case"july":
			case"aug":
			case"oct":
			case"dec":
			{
				System.out.println("31 days");
			}break;
		case"apr":
			case"june":
			case"sept":
			case"nov":
			
			{
				System.out.println("30 days");
			}break;
case "feb":
			{
				if (year%400==0 || year%4==0 && year%100!==0)
				{System.out.println("29");
				}
				else
				{
					System.out.println("28");
				}
			}break;

		default:
			{
				System.out.println("invalid days");
			}
		}

	}
}