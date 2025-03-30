package array2;
// find 1st last mid number of the array
public class Program2 {
	public static void print(int [] a)
	{
		int first = 0;
		int last = a.length-1;
		int mid=last/2;
		
		System.out.println(" Frist = "+a[first]);
		System.out.println(" Last =  "+a[last]);
		System.out.println(" mid = "+a[mid]);
	}
public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7,8,9};
	print(num);
	System.out.println("--------------");
	
	for(int i =num.length-1;i>=0;i--)
	{
		System.out.print(num[i]+" ");
	}

	}
}

