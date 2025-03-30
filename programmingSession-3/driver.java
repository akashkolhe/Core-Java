package MethodShadowing;

public class driver {

    public static void main(String[] args) {
        parent p1 =new parent();
        p1.m1();
        child ch=new child();
        ch.m1();
        parent p2=ch;
        System.out.println(" ");
        p2.m1();
    }
}

