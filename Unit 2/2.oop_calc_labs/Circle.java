//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius=rad;
	}

	public void calculateArea( )
	{
		area = radius*radius*Math.PI;
	}

	public void print( )
	{
		System.out.print("The Area Is :: ");
		System.out.printf("%.4f",area);
		System.out.println();
	}
}