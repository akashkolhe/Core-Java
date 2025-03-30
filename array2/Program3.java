package array2;

public class Program3 {
	static int search(int x[],int ele)
	{
		for (int i = 0; i < x.length; i++) {
			if(x[i]==ele)// i =2 89==89
				return i;
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int a []= {12,57,89,56,98};
		int n =search(a,89 );
		if(n==-1)
			System.out.println("elemnet or data is not there");
		else
		System.out.println("elemnet is  there at  "+n);
		
	}

}
