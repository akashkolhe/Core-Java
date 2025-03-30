package JAVA;

import java.util.Scanner;

public class StringContainVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String input=s.next();
        System.out.println(containVowel(input));
        System.out.println(containVowel2(input));
    }
    public static boolean containVowel(String in) {
        return  in.toLowerCase().matches(".*[aeiou].*");
    }

    public static boolean containVowel2(String in) {
        String n=in.toLowerCase();
        char [] ch=n.toCharArray();
        for(int i=0;i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                return true;
            }
        }
        return false;
    }
}
