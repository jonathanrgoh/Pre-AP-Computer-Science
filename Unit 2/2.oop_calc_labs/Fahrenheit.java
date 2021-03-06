//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit=fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius=fahrenheit-32;
		celsius=celsius*5;
		celsius=celsius/9;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f",fahrenheit);
		System.out.print("Degrees Fahrenheit");
		System.out.print(" == ");
		System.out.println(String.format("%.2f",getCelsius()));
		System.out.print(" Degrees Celsius ");
		System.out.println();
	}
}