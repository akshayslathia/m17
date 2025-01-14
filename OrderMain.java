class Order
{
	int orderId;

	Order(){}

	Order(int orderId)
	{
		this.orderId = orderId;
	}

	public void orderDone()
	{
		System.out.println("Ordered successfully");
		System.out.println("--------------------");
	}
}

class Laptop extends Order
{
	String brand;
	double price;

	Laptop(int orderId,String brand,double price)
	{
		super(orderId);
		this.brand = brand;
		this.price = price;
	}

	public void displayDetails()
	{
		System.out.println("Order id :"+orderId);
		System.out.println("Brand is :"+brand);
		System.out.println("Price is :"+price);
	}
}

class Mobile extends Order
{
	String brand;
	double price;

	Mobile(int orderId,String brand,double price)
	{
		super(orderId);
		this.brand = brand;
		this.price = price;
	}

	public void displayDetails()
	{
		System.out.println("Order id :"+orderId);
		System.out.println("Brand is :"+brand);
		System.out.println("Price is :"+price);
	}
}

class AC extends Order
{
	String brand;
	double price;

	AC(int orderId,String brand,double price)
	{
		super(orderId);
		this.brand = brand;
		this.price = price;
	}

	public void displayDetails()
	{
		System.out.println("Order id :"+orderId);
		System.out.println("Brand is :"+brand);
		System.out.println("Price is :"+price);
	}
}

class OrderMain
{
	public static void checkProduct(Order asfkjbasfkjlbasfkjlbafs)
	{
		if( asfkjbasfkjlbasfkjlbafs instanceof Laptop)
		{
			Laptop l = (Laptop) asfkjbasfkjlbasfkjlbafs;
			l.orderDone();
			l.displayDetails();
		}
		else if( asfkjbasfkjlbasfkjlbafs instanceof Mobile)
		{
			Mobile m = (Mobile) asfkjbasfkjlbasfkjlbafs;
			m.orderDone();
			m.displayDetails();
		}
		else 
		{
			AC a = (AC) asfkjbasfkjlbasfkjlbafs;
			a.orderDone();
			a.displayDetails();
		}
	}
	public static void main(String[] args) 
	{
		
		Order o1 = new Laptop(2001,"ASUS",60000d);
		Order o2 = new Mobile(3001,"Kachoda",1300d);
		Order o3 = new AC(4001,"Blue Star",25000d);
		checkProduct(o3);
	}
}