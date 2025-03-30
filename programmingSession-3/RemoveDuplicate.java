package Array;

public class RemoveDuplicate {
		public static void main(String[] args) {
		int arr[]= {3,7,5,7,8,9};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
			
		}
		System.out.println("After remove duplicate records");
		for(int k=0;k<=arr.length-1;k++)
		{
			if(arr[k]!=0)
			{
				System.out.println(arr[k]);
				
			}
		}
	}
}
