package logicals5;

public class Program4 {
	public static void circle(double r)
	{
		double area=3.14*r*r;
		double cir =2*3.14*r;
		System.out.println("radius is : "+r);
		System.out.println("area is : "+area);
		System.out.println("cricumfernce is : "+cir);
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		circle(5.7);
		System.out.println("main ends");
		
	}

}
