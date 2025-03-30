package collection;

import java.util.TreeSet;

public class Program15 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("B");
		t.add("C");
		t.add("A");
		for(Object o:t)
		{
			System.out.println(o);
		}
	}

}
