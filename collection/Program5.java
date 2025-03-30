package collection;

import java.util.ArrayList;

public class Program5 {
	public static void main(String[] args) {
		ArrayList  l = new ArrayList();
	    l.add(10);
	    l.add(20);
	    l.add(30);
	    l.add(40);
	    System.out.println(l);
	    l.add(1,50);
	    System.out.println(l);
	    l.set(3, 60);
	    System.out.println(l);
	  
	}

}
