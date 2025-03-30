package Override_all3;
//toString, equals, hashCode method overriding --------
	public class Student {
	int id;
	String name;
	Student(int id, String name) {
	this.id=id;
	this.name=name;
	}
	public String toString()
	{
	 return "ID="+id+"name="+name;
	}
	public boolean equals(Object o)
	{
	  Student s1= (Student)o;
	  return name.equals(s1.name);
	}
	public int hashcode() {
	int a = name.hashCode();
	int b= id;
	return a+b;
	}
	public static void main(String [] args) {
	Student s1=new Student(23,"AKASH");
	Student s2=new Student(25,"Ram");
	System.out.println(s1.toString());
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashcode());
	System.out.println(s2.hashcode());
	}
}
