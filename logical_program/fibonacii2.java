package logical_program;

public class fibonacii2 {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=5;
		System.out.println(n1+" "+n2);
		
		for(i=2;i<=5;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
