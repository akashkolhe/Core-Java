package array3;
// how add objects to an array
public class Emp {
	int id;
	String name;
	Emp(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	public void edetails()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public String toString()
	{
		return id+" "+name;
	}
}
