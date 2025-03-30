package Arraylist;
import java.util.ArrayList;
//Arraylist -----------------------------------
public class Program4 {
		public static void main(String[] args) {
			ArrayList al1=new ArrayList ();
			al1.add(10);
			al1.add(20);
			al1.add(30);
			al1.add(40);
			al1.add(50);
			for(int i=0;i<=al1.size()-1;i++)
			{
				System.out.print(al1.get(i));
				System.out.print(" ");
			}
	}
	}