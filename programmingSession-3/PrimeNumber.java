package Array;

public class PrimeNumber {
		public static void main(String[] args) {
			int arr[]= {7,11,6,19,15,4};
			for(int i=0;i<=arr.length-1;i++)
			{
				int factors=0;
				for(int j=1;j<=arr.length-1;j++)
				{
					if(arr[i]%j==0)
					{
						factors++;
			
					}
				}
				if(factors==2)
				{
					System.out.println(arr[i]);
				}
			}
			
		}
	}