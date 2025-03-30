package MethodOverloading;

public class Demo1 {
public static void main(String[] args) {
	add(1,2,3);
	add(1,2);
}
	
	public static void add(int a)
	{
		System.out.println("from 1");
	}
	public static void add(int a,int b)
	{
		System.out.println("from 2");
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("from 3");
	}	
}

