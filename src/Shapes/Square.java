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
		side = s;
		area = Math.pow(s, 2);
		perimeter = s * 4;
	}

}
