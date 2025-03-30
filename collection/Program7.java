package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program7 {
  public static void main(String[] args) {
	
	 // ArrayList  l1 = new ArrayList(50);
	  ArrayList  l = new ArrayList();
	  l.add(10);
	  l.add(20);
	  l.add(30);
	  System.out.println(l);
	  LinkedList  l2 = new LinkedList(l);
	  l2.add(40);
	  l2.add(50);
	  System.out.println(l2);
			  
  }
}
