package logical_program;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int num1=0,num2=1,num3,i,count=5;
       
       
       //num1 and num2 print here 0,1
       System.out.println(num1);
       System.out.println(num2);
       
       System.out.println("---------------------------");
       
       for(i=2;i<=5;i++) {
    	   
    	   num3=num1+num2;//num3=0+1=1, num3=1+1=2
    	   
    	   System.out.println(num3);//1,2
    	   
    	   num1=num2;//1
    	   num2=num3;//2
       }// 0 1 1,2 3 5 8
	}

}
