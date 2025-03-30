package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Edriver {
	public static void main(String[] args) {
		Emp e1 = new Emp("ana",101);
		Emp e2 = new Emp("bell",102);
		Emp e3 = new Emp("smith",103);
		Emp e4 = new Emp("charles",104);
		
		LinkedHashSet<Emp> t = new LinkedHashSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		for(Emp e: t)
		{
			System.out.println(e);
		}
				
	}

}
