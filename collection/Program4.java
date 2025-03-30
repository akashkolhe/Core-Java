package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program4 {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l+"  "+l.size());
		
	   LinkedList l1 = new LinkedList();
	   l1.addAll(l);
	   l1.add(40);
	   l1.add(50);
	   System.out.println(l1+"  "+l1.size());
	   
	   System.out.println(l1.containsAll(l));
	   l1.removeAll(l);
	   System.out.println(l1);
	   
	
	}

}
