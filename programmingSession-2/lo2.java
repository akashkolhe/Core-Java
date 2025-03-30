class A
{
  int k=10;
}
class B extends A
{
	int l= 30;
}
class C extends B
{
	int m = 30;
}
class  D extends C
{
	int n = 40;
}
class Driver4
{
	public static void main(String[] args)
	{
		A al = new C();
		System.out.println(a1.k);
		System.out.println(a1.instanceof B);
		B.b1 = (B)a1;
		System.out.println(b1.k);
		System.out.println(b1.l);

}
}