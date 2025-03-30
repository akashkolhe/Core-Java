package collection;

import java.util.HashSet;

public class Program12 {
	public static void main(String[] args) {
		HashSet  h = new HashSet();
		h.add(10);
		h.add(10);
		h.add(11.22);
		h.add(null);
		h.add(null);
		h.add("java");
		h.add("java");
		
		System.out.println(h.size());
		
		for(Object o:h)
		{
			System.out.println(o);
		}
	}

}
