package Shapes;

public abstract class Quadrilateral extends Shape
{
	private double area;
	private double perimeter;
	
	public Quadrilateral()
	{
		super(4);
	}
	
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public double getSides()
	{
		return 4;
	}
	
	public abstract int compareTo(Shape s);

}
