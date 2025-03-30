package Exceptions;
		// NULL POINTER EXCEPTION -------
		public class NullPointer {
			public static void main(String[] args) {
			
			{
				String s =null;
				try
				{
					if(s.equals("AKASH"))
					System.out.println("Same");
				else
					System.out.println("Not Same");
				}
				
			    catch(NullPointerException e)
				{ 
//			    	System.out.println(e);
			    	System.out.println("[ Exception Handle for NullPointer ]");
				}
				}
			}	
	}

