package logicals5;

public class Program5 {
	static int biggest(int x , int y , int z)
	{
		if(x>y && x>z)
			return x;
		else if (y>z)
			return y;
		else
			return z;
	}
 public static void main(String[] args) {
	
	 int big = biggest(78,45,98);
	 System.out.println(big);
	 
	 System.out.println("----------");
	 System.out.println(biggest(200,300,100));
	 
}

}
