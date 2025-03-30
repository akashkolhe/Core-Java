//WAP to find the count the vowels present inside lower case characters
class  count
{
	public static void main(String[] args) 
	{
		int count=0;
		for(char ch='a';ch<='z';ch++)
		{
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				count++;
			}

		}
		System.out.println(count);
	}
}
