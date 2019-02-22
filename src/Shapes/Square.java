package Shapes;

public class Square extends Quadrilateral
{
	private double side;
	private double area;
	private double perimeter;
	
	public Square()
	{
		super();
	}
	
	public Square(double s)
	{
		super();
		area = Math.pow(s, 2);
		perimeter = s * 4;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	public int compareTo(Shape s)
	{
		return Double.compare(this.getArea(), s.getArea());
	}

}
