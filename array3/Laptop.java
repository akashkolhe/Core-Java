package array3;

public class Laptop implements Comparable{
	// comparable is used for default sorting
	int ram;
	String brand;
	Laptop(int ram , String brand)
	{
		this.ram=ram;
		this.brand=brand;
	}
	public String  toString()
	{
		return ram+"  "+brand;
	}
	public int compareTo(Object o)
	{
	if (this.ram>((Laptop)o).ram)
	  return 1;
	else if(this.ram<((Laptop)o).ram)
		return -1;
	else 
		return 0;
	
	
	
	}

}
