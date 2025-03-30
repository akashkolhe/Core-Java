package Arraylist;
import java.util.ArrayList;
//arraylist------------------------------------
public class Program1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.remove(3));
	    System.out.println(al.contains(20));
	}
	}

