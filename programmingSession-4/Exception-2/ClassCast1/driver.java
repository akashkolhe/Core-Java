package Exceptions.ClassCast1;
	public class driver {
	    public static void main(String[] args) {
	        parent p1 =new parent();
	        p1.m1();
	        try
	        {
	            child ch1 = (child) p1;
	            ch1.m1();
	        }catch(ClassCastException cs)
	        {
	            System.out.println("Handled");
	        }
	    }
	}
