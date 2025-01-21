abstract class Shape
{
	String colour;

	Shape(){}

	Shape(String colour)
	{
		this.colour = colour;
	}

	abstract public void drawShape();
	abstract public double calulateArea();
}

class Rectangle extends Shape
{
	double length;
	double breadth;

	Rectangle(String colour,double length,double breadth)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void drawShape()
	{
		System.out.println("Drawing rectangle with colour :"+colour+" , length "+length+
							" , breadth "+breadth+" whose area is "+calulateArea());
	}

	@Override
	public double calulateArea()
	{
		return (length* breadth);
	}
}

class Circle extends Shape
{
	double radius;
	Circle(String colour,double radius)
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public void drawShape()
	{
		System.out.println("Drawing circle with colour :"+colour+" , radius "+radius+" whose area is "+calulateArea());
	}

	@Override
	public double calulateArea()
	{
		return (Math.PI * radius * radius);
	}

}

class Square extends Shape
{
	int side;
	Square(String colour,int side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public void drawShape()
	{
		System.out.println("Drawing square with colour :"+colour+" , side "+side+" whose area is "+calulateArea());
	}

	@Override
	public double calulateArea()
	{
		return (side * side);
	}
}

class ShapeMain
{
	public static void main(String[] args) 
	{
		Shape s;

		s = new Rectangle("Red",52.34d,36.67d);
		s.drawShape();
		System.out.println("------------------");
		s = new Circle("Brown",45.23d);
		s.drawShape();
		System.out.println("------------------");
		s = new Square("Pink",23);
		s.drawShape();
		
	}
}