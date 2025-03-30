package collection;

import java.util.LinkedList;

public class Program3 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("java");
		System.out.println(l.size());
		for(int i =0;i<l.size();i++) // i =0 0<4 get(0) i =1 get(1) i =2 get(2)  i=3 get(3) i=4 4<4 
		{
			System.out.println(l.get(i));
		} 	
		System.out.println("----------");
		for(int i =l.size()-1;i>=0;i--)//i=4-1 i=3
		{
			System.out.println(l.get(i));
		}
	}

}
