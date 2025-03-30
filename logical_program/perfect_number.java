package logical_program;

//wrong program
import java.util.Scanner;

public class perfect_number {
public static void main(String[] args) {
	int i, j, num, sum = 0, temp;
    
	//System.out.println("Enter any number");
   // Scanner sc=new Scanner(System.in);
    
   // num=sc.nextInt();
    num=28;
    for(i=1; i<num; i++)
    {	
    	sum=0;
    	temp=i;
    	//System.out.println(temp);
    	for(j=1;j<i;j++)
    	{
    		if(temp%j == 0)
	        {
	            sum =sum + j;
	        }
	    }
    	if(sum == i)
	    {
	        System.out.println(" This is PERFECT NUMBER : "+ j);
	    }
}
}
}