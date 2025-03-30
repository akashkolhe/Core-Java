package array1;
// duplicate of array
public class Program4 {
	public static void main(String[] args) {
		int []a = {10,30,50, 70 , 90};
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("-----------");
		int []b =a;
		for(int j :b)
		{
			System.out.println(j);
		}
	}

}
