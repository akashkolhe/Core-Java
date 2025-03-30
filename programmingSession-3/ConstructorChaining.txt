package ConstructorChaining;
	//CONSTRUCTOR CHAINING -----------------------
	public class book {
		int id;
		int price;
		String name;
		book(int id)
		{
			this.id=id;
		}
		book(int id, int price)
		{
			this(id);
			this.price=price;
		}
		book(int id, int price, String name)
		{
			this(id,price);
			this.name=name;
		}
	public void display()
	{
	System.out.println("price is "+price+" "+"ID is "+id+" "+"Name Is "+name);	
	}
	public static void main(String[] args) {
		book b1=new book(1,500,"JAVA");
		b1.display();
	}
	}
