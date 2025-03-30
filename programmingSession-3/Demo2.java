package MethodOverloading;

public class Demo2 {
public static void main(String[] args) {
	add(10,20);
	add(10,20.5);
}
	public static void add(int a, int b)
	{
		System.out.println("from  int, int");
	}
	public static void add(double a,double b)
	{
		System.out.println("from double,double");
	}
	public static void add(int a , double b)
	{
		System.out.println("from int ,double");
	}
}
