package com.akash.programs;

public class Nullpointer {
	public static void main(String[] args) {
	
	{
		String a =null;
		try
		{
			if(a.equals("ak"))
		
		
			System.out.println("equal");
		
			
		else
		
			System.out.println("Not equal");
		}
		
	    catch(NullPointerException e)
		{ 
	    	System.out.println(e);
	    	System.out.println("Exception Handled");
		}
		

	}
	}
}
