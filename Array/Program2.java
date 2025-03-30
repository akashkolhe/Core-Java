package Array;

public class Program2 {
	public static void main(String[] args) {
		String name []=new String[5];
		name[0]="tom";
		name[1]="ted";
		name[2]="sana";
		name[3]="ani";
		name[4]="charli";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		System.out.println("-----------------");
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
			
		}
		System.out.println("------------");
		for(String s : name)
		{
			System.out.println(s);
		}
		System.out.println(name.length);
	}

}
