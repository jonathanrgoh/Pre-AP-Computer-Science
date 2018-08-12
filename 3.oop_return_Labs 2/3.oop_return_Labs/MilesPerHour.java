//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
      distance = dist;
      hours = hrs;
      minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
      distance = dist;
      hours = hrs;
      minutes = mins;
	}

	public void calcMPH()
	{
	   double minsAsHours = (double)(minutes)/60;
	   //out.printf("%.2f\n",minsAsHours);
	   double time = (double)(hours)+minsAsHours;
	   //out.printf("%.2f\n",time);
      mph = round((double)(distance)/time);
      //out.printf("%f\n\n",mph);
	}

	public void print()
	{
      out.printf("%d miles in %d hours and %d minutes = %d MPH\n\n",distance,hours,minutes,(int)(mph));
	}
}