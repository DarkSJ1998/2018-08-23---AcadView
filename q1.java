class Rectangle
{
	private double length, breadth, area;
	
	public void setVals(double l, double b)
	{
		length = l;
		breadth = b;
	}
	
	public void CalculateArea()
	{
		area = length * breadth;
	}
	
	public void getArea()
	{
		System.out.println("Length : " + length + " m");
		System.out.println("Breadth : " + breadth + " m");
		System.out.println("Area : " + area + " sq. m");
	}
}

class q1
{
	public static void main(String x[])
	{
		Rectangle obj = new Rectangle();
		obj.setVals(5.0,2.9);
		obj.CalculateArea();
		obj.getArea();
	}
}