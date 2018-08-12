//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calculateSlope( )
	{
		xOne=xTwo-xOne;
		yOne=yTwo-yOne;
		slope=yOne/xOne;
	}

	public void print( )
	{
		System.out.print("The Slope Is :: ");
		System.out.printf("%.2f",slope);
		System.out.println();
	}
}