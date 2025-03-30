package collection;

public class Program16 {
	public static void main(String[] args) {
		String a ="A";
		String b ="B";
		System.out.println(a.compareTo(b));//-1 65 <66
		System.out.println(b.compareTo(a));//+1 66>65
		System.out.println(b.compareTo(b));//0  66==66
		System.out.println("-----");
		Double c =11.22;
		Double d =33.44;
		System.out.println(c.compareTo(d));//-1
		System.out.println(d.compareTo(c));//+1
		System.out.println(c.compareTo(c));//0
		
	}

}
