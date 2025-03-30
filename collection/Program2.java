package collection;

import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args) {
		ArrayList  l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		//System.out.println(l.get(99));
		System.out.println(l.contains(10));
		System.out.println(l.contains(99));
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		System.out.println(l.indexOf(20));
		System.out.println(l.indexOf(100));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		
	}

}
