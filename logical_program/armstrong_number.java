package logical_program;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int armstrongnum=0,temp,lastdigit;
      
      int num=153;
      
      temp=num;
      
      while(num>0)
      {
    	  lastdigit=num%10;//find last digit 3
    	  num=num/10;//removing last digit 3 only 15 there
    	  armstrongnum=armstrongnum+(lastdigit*lastdigit*lastdigit);
    	  //calculating sum of cube
      }
      if(armstrongnum==temp)
      {
    	  System.out.println("it is armstrong number ");
      }
      else 
      {
    	  System.out.println("it is not armstrong number");
      }
		
	}

}
