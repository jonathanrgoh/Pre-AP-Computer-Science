//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{

		distance=dist;
		hours=hrs;
		minutes=mins;


	}

	public void setNums(int dist, int hrs, int mins)
	{

		distance=dist;
		hours=hrs;
		minutes=mins;


	}

	public void calcMPH()
	{

		mph=distance / ((minutes/60)+hours);


	}

	public void print()
	{

		System.out.print("\n");
		System.out.printf("%.0f", distance);
		System.out.print(" miles in ");
		System.out.printf("%.0f", hours);
		System.out.print(" hour and ");
		System.out.printf("%.0f", minutes);
		System.out.print(" minutes");
		System.out.print(" = ");
		System.out.print(Math.round(mph) + " MPH. ");
		System.out.println();

	}
}