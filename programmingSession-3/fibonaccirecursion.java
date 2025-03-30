package JAVA;

import java.util.Scanner;

/**
 * fibonaccirecursion
 */
public class fibonaccirecursion {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        fibonacci(num);
        fibonacci2(num);
    }
    public static void fibonacci(int n) {
        int a=0;
        int b=1;
        int c=1;

        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println();
    }

    public static void fibonacci2(int n) {
        int n1=0;
        int n2=1;
        int temp=1;
        for(int i=1;i<=n;i++){
            System.out.print(n1+",");
            n1=n2;
            n2=temp;
            temp=n1+n2;
        }
    }
}