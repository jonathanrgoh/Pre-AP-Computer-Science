//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
	}

	public void average( )
	{
		double sum=one+two;
		average=sum/2;

	}
	public void print( )
	{
		System.out.printf("%.1f",one);
		System.out.print(" + ");
		System.out.printf("%.1f",two);
		System.out.print(" has an average of ");
		System.out.printf("%.2f",average);
		System.out.println();
	}
}