package strings;

public class Program1 {
	public static void main(String[] args) {
		
		String s1 ="java";
		System.out.println(s1);
		
		//empty representation 
		String s2 =new String();
		System.out.println(s2);
		
		// pass data
		String s3 = new String("java");
		System.out.println(s3);
		
		// converting char[]  to String
		char c []= {'j','a','v','a'};
		String s4=new String(c);
		System.out.println(s4);
	}

}
