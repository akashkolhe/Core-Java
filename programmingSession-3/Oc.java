class Oc 
{
	public static void main(String[] args) 
	{
		String s ="abcABCAabc";
		int count=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			count=0;

			for(int j=1;j<=s.length()-1;j++)
			{
				if(j<i && s.charAt(i) == s.charAt(j))
				{
					break;
				}
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
				
			}
		if(count!=0)
		System.out.println(s.charAt(i)+"..."+count);
		}
	}
}
