package Exceptions;
import java.util.TreeSet;

public class ClassCast13 {
public static void main(String[] args) {
	TreeSet a1=new TreeSet();
	a1.add(1);
	a1.add(2);
	try {
	a1.add('d');
	System.out.println(a1);
	}
	catch(ClassCastException e)
	{
		System.out.println("exception handle");
	}
	
}
}
