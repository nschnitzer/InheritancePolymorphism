package Shapes;

public abstract class Shape implements Comparable<Shape>
{
	private double area;
	private double perimeter;
	private double sides;
	
	public Shape()
	{
		
	}
	
	public Shape(double area, double perimeter, double sides)
	{
		this.area = area;
		this.perimeter = perimeter;
		this.sides = sides;
	}
	
	public Shape(double sides)
	{
		this.sides = sides;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(Shape s)
	{
		return Double.compare(this.getArea(), s.getArea());
	}
	

}
