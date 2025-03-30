package ProgrammingSession;

public class ToStringOverriding
{
	int id;
	String name;
	ToStringOverriding(int id, String name)
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
