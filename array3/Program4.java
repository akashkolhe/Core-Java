package array3;
// missing elements in sorted array
public class Program4 {
	public static void main(String[] args) {
		int a []= {1 , 4,9 };
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = a[i]+1; j < a[i+1]; j++) 
			{
				System.out.println(j);
			}
			
		}
	}

}
