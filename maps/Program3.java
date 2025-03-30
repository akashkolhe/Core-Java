package maps;

import java.util.Set;
import java.util.TreeMap;

public class Program3 {
	public static void main(String[] args) {
		TreeMap<Double, Integer> l = new TreeMap();
		l.put(1.4, 20);
		l.put(1.2, 10);
		l.put(1.6, 30);
		Set<Double> s = l.keySet();
		for(Double key: s)
		{
			System.out.println(key+" "+l.get(key));
		}
		TreeMap<String, Integer> t = new TreeMap();
		t.put("Banana", 90);
		t.put("Apple", 240);
		t.put("Chickoo", 150);
		Set<String> s1 = t.keySet();
		for(String key1 : s1)
		{
			System.out.println("cost of 1kg "+key1+" is  "+t.get(key1));
		}
	}

}
