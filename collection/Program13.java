package collection;

import java.util.LinkedHashSet;

public class Program13 {
public static void main(String[] args) {
	LinkedHashSet<String> l = new LinkedHashSet();
	l.add("apple");
	l.add("chicko");
	l.add("chicko");
	l.add("gavava");
	l.add("gavava");
	l.add("banana");
	l.add("banana");
	for(Object o: l)
	{
		System.out.println(o);
	}
}
}
