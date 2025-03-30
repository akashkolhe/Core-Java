package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program11 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println("-----------");
		LinkedList<String> l = new LinkedList();
		l.add("java");
		l.add("sql");
		l.add("web");
		for(String s: l)
		{
			System.out.println(s);
		}
	}

}
