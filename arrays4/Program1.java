package arrays4;
// find the common elements present in arrays
public class Program1 {
	public static void main(String[] args) {
		int a[]= {10,30, 90 ,50, 30, 30};
		int b []= {30,60, 90,100};
		System.out.println("common elements are ");
		
		for(int i =0; i<a.length;i++)
		{
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
		
					System.out.println(a[i]);
					break;
					//continue;
				}
			
			}
			break;
		}
		
	}

}
