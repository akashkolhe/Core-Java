package arrays4;
// to find the count between to 2 numbers
public class Program2 {
	static int countIn(int x[], int start, int end)
	{
	int count = 0;
	for (int i = 0; i < x.length; i++)
	{
		if(x[i]>=start && x[i]<=end)
			count++;
			
	}
	return count;
		
}
	
public static void main(String[] args) {
	int a[]= {1,2,3,4,6,7,8,9};
	int  i =countIn(a,3,7);
	System.out.println(i);
	
	
}
}
