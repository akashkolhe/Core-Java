package programs;

public class Obj {
	
	
  public static void main(String arges[]) {
	  String s1 = "new";
	  String s2 = new String("new");
	  String s4 = new String("new");
	  
	  String s3 = "new1";
	  System.out.println(s1 == s2);
	  System.out.println(s1.equals(s2));
	  System.out.println(s2 == s4);
	  System.out.println(s2.equals( s3));
	  System.out.println(s1.equals(s3));
	  
			  
  }
}
