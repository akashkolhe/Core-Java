package logicals5;
// swaping of 2 number without using 3 variable
public class Program2 {
public static void main(String[] args) {
	int i =10;
	int j =20;
	i=i+j; //i = 10+20 // 30
	j=i-j;  // j= 30-20 // 10
	i=i-j; // i =30-10 // 20
	System.out.println("i = :"+i);
	System.out.println("j = :"+j);
	
}
}
