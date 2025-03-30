package Array;

public class SortAscending {
		public static void main(String[] args) {
			int arr[]= {10,8,9,5,7,6};
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					int temp;
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("after sorting in ascending order");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
