package Basic1;
import java.util.Scanner; // 1st
public class Program2 {
	public static void main(String[] args) {
		// find corresponding days present in a  month
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int m = s.nextInt(); //int m =9
		switch (m) {  // m =9 
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 days");
			break;
		case 2 :
			System.out.println("28 or 29 days");
			break;

		default:System.out.println("invalid month number");
		}
		
	
	}

}
