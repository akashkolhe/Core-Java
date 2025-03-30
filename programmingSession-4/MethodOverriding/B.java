package MethodOverriding;
public class B extends A{
		public void m1() {
			System.out.println("This is child class");
		}
		public static void main(String args[]) {
			B b =new B();
			b.m1();	
		}
}
