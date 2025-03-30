package array3;

import java.util.Arrays;

public class Ldriver {
	public static void main(String[] args) {
		Laptop l1= new Laptop(16, "dell");
		Laptop l2= new Laptop(4, "hp");
		Laptop l3= new Laptop(8, "asus");
		Laptop l4= new Laptop(12, "msi");
	
		
		Laptop l[]= {l1,l2,l3,l4};
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
			
		}
		Arrays.sort(l);
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
			
		}
	}

}
