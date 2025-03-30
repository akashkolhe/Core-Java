package array3;

public class Edriver {
	public static void main(String[] args) {
		Emp e[] = new Emp[5];
		e[0]= new Emp(103,"ana");
		e[1]= new Emp(102,"smith");
		e[2]= new Emp(101,"charles");
		e[3]= new Emp(104,"sana");
		e[4]= new Emp(105,"bell");
		System.out.println("print the emp objects");
		for (int i = 0; i < e.length; i++) 
		{
			System.out.println(e[i]);
			
		}
		
	
	}
}
