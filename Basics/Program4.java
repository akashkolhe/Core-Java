package Basics;

import java.util.Scanner;

// to check whether the entered number is three digit number or not

public class Program4 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = s.nextInt();
   if (num>99&&num<1000)
   {
	   System.out.println("number is three digit");
   }
   else
   {
	   System.out.println("Number is not three digit");
   }
}
}
