import java.util.*;
class great
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter three to find greater:");
System.out.println("enter a first number");
a=sc.nextInt();
System.out.println("enter a second number");
b=sc.nextInt();
System.out.println("enter a third number");
c=sc.nextInt();
if(a>b&& a>c)
System.out.println(a+" is greater");
else if(b>c)
System.out.println(b+" is greater");
else
System.out.println(c+" is greater");
}
}