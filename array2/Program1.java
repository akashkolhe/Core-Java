package array2;
// find number ODD or even in array
public class Program1 {
	
	public static int[] countEO(int [] x)
	{
		int ec=0;
		int oc=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]%2==0)
				oc++; 
			else
				ec++;
		}
		int count[]= {oc,ec};
		return count;
	}
  public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7,8,9};
	int c[]=countEO(a);
	System.out.println(c[1]+" number of odd numbers");
	System.out.println(c[0]+" numboer of even numbers");
}
}
