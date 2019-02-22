package Shapes;

public class Triangle extends Shape
{
	private double s1, s2, s3, perimeter, area;
	
	public Triangle()
	{
		super();
	}
	
	public Triangle(double s1, double s2, double s3) throws Exception
	{
		super(3);
		perimeter = s1 + s2 + s3;
		area = ((s1 + s2 + s3)/2)*(((s1 + s2 + s3)/2)-s1)*(((s1 + s2 + s3)/2)-s2*(((s1 + s2 + s3)/2)-s3));
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		checkTheorem();		
	}
	
	private void checkTheorem() throws Exception
	{
		if (s1 + s2 <= s3)
		{
			throw new Exception("Cannot form a triangle");
		}
	}
	
	public int getType()
	{
		if (Math.pow(s1 + s2, 2) < Math.pow(s3, 2))
		{
			return -1;
		}
		if (Math.pow(s1 + s2, 2) == Math.pow(s3, 2))
		{
			return 0;
		}
		return 1;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	@Override
	public int compareTo(Shape s)
	{
		return Double.compare(this.getArea(), s.getArea());
	} 

}
