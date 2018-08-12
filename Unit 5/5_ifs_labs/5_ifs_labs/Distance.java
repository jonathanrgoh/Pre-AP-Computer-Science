//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
      x1=0;
      y1=0;
      x2=0;
      y2=0;
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
      x1=xOne;
      y1=yOne;
      x2=xTwo;
      y2=yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
      x1=xOne;
      y1=yOne;
      x2=xTwo;
      y2=yTwo;
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
      String result="";

		distanceA = sqrt(pow((0-x1),2)+pow((0-y1),2));
      distanceB = sqrt(pow((0-x2),2)+pow((0-y2),2));

      if(distanceA<distanceB)
         result = "A is closer to (0,0)\n\n";
      if(distanceB<distanceA)
         result = "B is closer to (0,0)\n\n";
      if(distanceA == distanceB)
         result = "A and B are the same distance from (0,0)\n\n";
   		return result;
	}

	public String toString()
	{
		return "";
	}
}