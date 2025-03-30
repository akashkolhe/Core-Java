package array1;

import java.util.Scanner;
// find the avg of the array
public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =s.nextInt();
		double d []=  new double[size];
		System.out.println("enter "+size+ " values");
	    for (int i = 0; i < d.length; i++) {
			d[i]=s.nextDouble();
		}
	    double sum=0.0;
	    for ( double i :d) {
	    	sum+=i;//sum=sum+i;
			
		}
	    double avg=sum/d.length;
	    System.out.println("the avg of the array is :"+avg);
	    double sum1=0.0;
	    for (int i = 0; i < d.length; i++) {
	    	sum1+=d[i];
	    }
	    double avg1=sum1/d.length;
	    System.out.println("the avg of array is :"+avg1);
	    
	    
		
	}

}
