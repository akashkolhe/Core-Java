package JAVA;
import java.util.Scanner;
class Shadowing1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String curr=s.next();
        System.out.println(reverse(curr));
    }
     public static String reverse(String in) {
        if (in==null) {
            throw new IllegalArgumentException("String is null");
        }
        StringBuilder out=new StringBuilder();
        char[] chars=in.toCharArray();
        for (int  i = chars.length-1;i>=0; i--) {
            out.append(chars[i]);
        }
        return out.toString();
     }
}
