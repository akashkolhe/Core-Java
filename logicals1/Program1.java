package logicals1;

public class Program1 {
	public static void main(String[] args) {
		int a = 10;
		a=a++;
		System.out.println(a); // 10
		
		int b = 10;
		b =++b; 
		System.out.println(b);// 11
		
		int c = 10;
		System.out.println(c++);
		System.out.println(c);//11
		
		int d = 10;
		++d;
		System.out.println(d);//11
	}

}
