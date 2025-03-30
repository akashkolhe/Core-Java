package strings;

public class Program3 {
	public static void main(String[] args) {
		
		String s1= "java";
		String s2 ="JAva";
		String s3="java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
	    String s4="GOOD AFTERNOON";
	    
	    System.out.println(s4.substring(5,10));
	    System.out.println(s4.substring(11));
	}

}
