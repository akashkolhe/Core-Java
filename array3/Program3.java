package array3;
// find the 1st and 2nd biggest in array
public class Program3 {
	public static void main(String[] as)
	{
		int a []= {24,56,87,99,12,47	};
		int fbig=a[0];
		int sbig=a[1];
		for (int i = 0; i < a.length; i++)
		{
			if(fbig<a[i])
			{
				sbig=fbig;
				fbig=a[i];
			}
			else if(sbig<a[i])
			{
				sbig=a[i];
			}
			
		}
		System.out.println("1st biggest :"+fbig);
		System.out.println("2nd biggest :"+sbig);
			
		}
		
 	}


