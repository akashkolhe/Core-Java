import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a month");
		String month=s.next();
		switch(month)
		{
			case "Jan":
			case "Mar":
			case "May":
			case "July":
			case "Aug":
			case "Oct":
			case "Dec":
			{
				System.out.println("31 days");
			}
			break;
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
			{
				System.out.println("30 days");
			}
			break;
			case "Feb":
			{
				System.out.println("Enter the year");
		int year=s.nextInt();
				
				if (year%400==0 || year%4==0 && year%100!=0)
				{
					System.out.println("29 days");
				}
				else
				{
					System.out.println("28 days");
			    }
			}
			break;
			default:
			{
				System.out.println("Invalid key");
			}

		}
	}
}
