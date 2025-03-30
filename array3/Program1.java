package array3;
// sorting the array in ascending using sort();
import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int a []= {100,20,50,10,40,90};
		Arrays.sort(a);
		
		System.out.println("the sorted  array are ");
		for (int i = 0; i < a.length; i++)
		{
		   System.out.println(a[i]);	
		}
	System.out.println("-----------");
	for(int i = a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	}

}
