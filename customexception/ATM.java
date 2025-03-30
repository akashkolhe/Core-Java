package customexception;

import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int balance= 10000;
		System.out.println("Enter the amount to withdraw");
		int amount = s.nextInt();
		if(amount<=balance)
		{
			System.out.println("Withdraw Successfull");
		}
		else
		{
			try
			{
			throw new InsuffientBalanceEcxeption();
			}
			catch(InsuffientBalanceEcxeption e)
			{
				System.out.println("not enough balance");
			}
			
		}
	}

}
