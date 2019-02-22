package Shapes;

public abstract class Shape implements Comparable<Shape>
{
	
	public double sides;
	
	public Shape()
	{
		
	}
	
	public Shape(double sides)
	{
		this.sides = sides;
	}
	

	public abstract double getArea();
	
	public abstract double getPerimeter();
	

	public abstract int compareTo(Shape s);

}
