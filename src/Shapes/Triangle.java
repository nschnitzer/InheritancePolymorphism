package Shapes;

public class Triangle extends Shape
{
	private double s1, s2, s3, perimeter, area;
	
	public Triangle()
	{
		
	}
	
	public Triangle(double s1, double s2, double s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		perimeter = this.s1 + this.s2 + this.s3;
	}

}
