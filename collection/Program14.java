package collection;

import java.util.TreeSet;

public class Program14 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(30);
		t.add(10);
		t.add(40);
		t.add(40);
		t.add(20);
		for(Object o: t)
		{
			System.out.println(o);
		}
	}

}
