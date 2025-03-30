package basics2;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE CAR PRICE");
		int p= s.nextInt();
		String tax=p>=1000000?"tax :20%":(p>500000&&p<100000)?"tax :15%":(p<500000)?"tax :10%":"invalid option";
		System.out.println(tax);
	}
	

}
