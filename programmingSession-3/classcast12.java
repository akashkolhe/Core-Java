package Exceptions;
// class cast exception -----------------------------------------------
class classcast12 {
		public static void main(String[] args)
			{
			 try {
			      Object o = new Object();
			      String s = (String)o;
			      System.out.println(s);
			     }
			 catch (Exception e) 
			        {
			        System.out.println(" exception Handled");
			        }
			    }
			}
