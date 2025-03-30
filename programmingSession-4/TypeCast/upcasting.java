package TypeCast;

public class upcasting {
	public static void main(String[] args) {
		child ch=new child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		parent p1=ch;    				//upCasting
		System.out.println(p1.a);
		child ch1=(child)p1;    		//downCasting
		System.out.println(ch1.b);
		
		
	}
}
