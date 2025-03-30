package logical_program;

public class given_String_convertintoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="i am aayodhya satale";
		System.out.println(str.toUpperCase());//to convert uppercase
		System.out.println(str.indexOf("e"));//find index of character
		
		
		String str2="WELCOME";
		System.out.println(str2.toLowerCase());//convert lowercase
		
		System.out.println(str2.charAt(2));//find character 
		
		//1. logical AND operator
		int a=10;
		System.out.println(a>9 && a<11);//true
		System.out.println(a>15 && a<12);//false
		
		//2logical OR operator
		int b=12;
		System.out.println(b>15 || b<13);//true
		System.out.println(b>15 || b<9);//false
		
		//3 logical NOT operator
		System.out.println(!(b>15 || b<9));//false to true conversion
		System.out.println(!(b>15 || b<13));//true to false conversion
	}

}
