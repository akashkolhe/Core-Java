package JAVA;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(prime(num));
        System.out.println(prime2(num));
    }
    // 1st logic
    public static boolean prime(int n) {
        if (n==0 || n==1) 
            return false;
        if (n==2) 
            return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    // 2nd logic
    public static boolean prime2(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            return true;
        }
        return false;
    }
}
