package programs;

public class Override {
	int Id;
	String Name;
	Override(int id, String name){
		this.Id=id;
		this.Name=name;
	}
	public String toString()
	{
		return "Name="+Name+" id="+Id;
		
	}
	public boolean equals(Object o)
	{
		Override o2 =(Override)o;
		return Name.equals(o2.Name);
	}
	public int hashCode() {
		int a=Name.hashCode();
		int b = Id;
		return a;
	}
	
	public static void main(String[] args) {
		Override o1=new Override(1,"abc");
		System.out.println(o1);
		//By using equals method
		Override o3 =new Override(2,"xyz");
		System.out.println(o3.equals(o1));
		//By using hashcode()
		System.out.println(o1.hashCode());
		System.out.println(o3.hashCode());
				
	}
}
