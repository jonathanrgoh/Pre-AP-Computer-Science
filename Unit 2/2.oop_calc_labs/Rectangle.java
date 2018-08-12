//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter=length+length+width+width;
	}

	public void print( )
	{
		System.out.println("The pweimeter is :: " + perimeter);
	}
}
