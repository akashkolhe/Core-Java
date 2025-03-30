package maps;

import java.util.HashMap;

public class Program1 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(10,"java");
		h.put(11.22,'a');
		h.put("hi",99);
		h.put('a',"java");
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.containsKey("hi"));
		System.out.println(h.containsKey(99));
		System.out.println(h.containsValue('a'));
		System.out.println(h.containsValue(88));
	   System.out.println(h.remove(10));
	   System.out.println(h.isEmpty());
	   h.clear();
	   System.out.println(h.isEmpty());
	   
	}

}
