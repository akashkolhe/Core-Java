package Arraylist;
import java.util.ArrayList;
//Arraylist -----------------------------------
public class Program3 {
	
		public static void main(String[] args) {
			ArrayList al1=new ArrayList ();
			al1.add(10);
			al1.add(20);
			al1.add(30);
			System.out.println(al1);
			ArrayList al2=new ArrayList();
			al2.add(40);
			al2.add(50);
			al2.add(60);
			System.out.println(al2);
			
			al1.add(al2);
//			al1.addAll(al2);
			System.out.println(al1);
			System.out.println(al2);
			System.out.println("----------------------");
			System.out.println(al1.get(3));
			System.out.println(al1.indexOf(30));
			al2.removeAll(al2);
			System.out.println(al2);
		}
	}
