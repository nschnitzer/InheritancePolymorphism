package Shapes;

public class Quadrilateral extends Shape
{
	private double area;
	private double perimeter;
	
	public Quadrilateral()
	{
		super(4);
	}
	
	public Quadrilateral(double area, double perimeter)
	{
		super(area, perimeter, 4);
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	public double getSides()
	{
		return 4;
	}
	
	

}
