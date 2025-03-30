class Emp 
{
	String Ename;
	int Eid;
	private double Esalary;

	public double getEsal()
	{
		return this.Esalary;
	}
	public void setEsal(double n)
	{
		this.Esalary=n;
	}
	Emp(String n,int id,double sal)
	{
		this.Enmae=n;
		this.Eid=id;
		this.Esalary=sal;
	}
	public void details()
	{
		System.out.println(this.Ename);
		System.out.println(this.Eid);
		System.out.println(this.Eslary);
	}
}
