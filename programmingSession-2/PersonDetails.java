import java.util.*;
class person
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int age;
long mobile;
String name,cityname;
System.out.println("Enter your Name:");
name=sc.nextLine();
System.out.println("Enter your  City Name:");
cityname=sc.nextLine();
System.out.println("Enter your Age:");
age=sc.nextInt();
System.out.println("Enter your Mobile Number:");
mobile=sc.nextLong();
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("City Name : "+cityname);
System.out.println("Mobile Number : "+mobile);
}
}