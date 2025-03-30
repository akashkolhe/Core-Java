package maps;

import java.util.LinkedHashMap;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap();
		l.put(10, "java");
		l.put(20, "web");
		l.put(30, "sql");
		
		Set<Integer> s = l.keySet();
		for(Integer key : s)
		{
			System.out.println(key +" "+l.get(key)+" "+key);
		}
	}

}
