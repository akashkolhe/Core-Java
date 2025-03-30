package collection;

public class Program10 {
	public static void main(String[] args) {
		// auto boxing
		int a  = 10;
		Integer b = new Integer(a);
		System.out.println(a+" "+b);
		double c =11.22;
		Double d = new Double(c);
		System.out.println(c+" "+d);
		System.out.println("-------------");
		
		 // auto unboxing
		Character e=new Character('$');
		char f=e;
		System.out.println(e+"  "+f);
		Integer i = new Integer(99);
		int j =i;
		System.out.println(i+"  "+j);
	}

}
