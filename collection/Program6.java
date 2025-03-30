package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Program6 {
	public static void main(String[] args) {
		LinkedList  l = new LinkedList();
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(20);
		System.out.println("before sorting");
		for(int i =0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("------------");
		Collections.sort(l);
		// after sorting
		for(int i =0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
