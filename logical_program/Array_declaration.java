package logical_program;

public class Array_declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         int[] a= {1,2,3,4,5};
		    
// datatype variblename[]  0,1,2,3,4 position
		System.out.println(a[4]);//print index number 2 value 3
		System.out.println(a);//hashcode print
		
		
		//15. Arrays
		 String[] cars = {"Volvo", "BMW", "Ford"};
		 System.out.println(cars[1]);
		 // Note: Indexing start from 0so print BMW when use 1
	 
		 //16. Arrays Sequence Change
		 String[] carsM = {"Volvo", "BMW", "Ford"};
		 carsM[0]= "Opel";
		 System.out.println(carsM[0]);
		// Output : Opel--- because Volvo replaced by Opel
		 
		 
		 //17. CFind out elements in String
		 String[] carsN = {"Volvo", "BMW", "Ford"};
		 System.out.println(carsN.length);
		// Output : Will Print Length of Elements
		
		 //18. Loop through the items in the cars array.
		 String[] carsO = {"Volvo", "BMW", "Ford"};
		 for(String i : carsO)
		 {
		 System.out.println(i);
		 }
		 //Output : Print Names of Car
		
		 //19. Two dimentional Arrays
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		 System.out.println(myNumbers);
	
		 String[] stdname= {"aayu","ram","aaditi"};
		
		 
		 //for each loop
		 for(int i=0;i<=stdname.length-1;i++)
		 {
			 System.out.println(stdname[i]);
		 }
		 
		 System.out.println();
		 System.out.println("aayu name cahnge to aayodhya");
		 stdname[0]="aayodhya";
		 
		 for (int i=0;i<=stdname.length-1;i++)
		 {
			 
		 System.out.println(stdname[i]);
		 }
		 
		 System.out.println(stdname[0]);
		 
		 
		 System.out.println(stdname.length);
		 
		 String[] std= {"satale","jadhav","shinde"};
		 for (String i:std)
		 {
			 System.out.println(i);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}
		 
	
		

		
		
	}


