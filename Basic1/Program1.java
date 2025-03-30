package Basic1;

import java.util.Scanner;
public class Program1 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month number");
		int m = s.nextInt(); // int m =6
		switch (m) {
		case 1:System.out.println("month is Jan it has 31 days");
		break;
		case 2:System.out.println("feb");
		break;
		case 3:System.out.println("march");
		break;
		case 4:System.out.println("april");
		break;
		case 5:System.out.println("may");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("augst");
		break;
		case 9:System.out.println("sept");
		break;
		case 10:System.out.println("oct");
		break;
		case 11:System.out.println("nov");
		break;
		case 12:System.out.println("dec");
		break;
		default:
			System.out.println("invalid option");
		}
	}

}
