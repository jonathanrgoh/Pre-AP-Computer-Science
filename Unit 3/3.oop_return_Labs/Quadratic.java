//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
      setEquation(0,0,0);
      rootOne = 0.0;
      rootTwo = 0.0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
      a = quadA;
      b = quadB;
      c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
      a = quadA;
      b = quadB;
      c = quadC;
 	}

	public void calcRoots( )
	{
	   double discrim = sqrt((pow(b,2)-(4*a*c)));
	   double bPlus = (0-b)+discrim;
	   double twoA = 2*(double)(a);
      rootOne = bPlus/twoA;

      double bMinus = (0-b)-discrim;
      rootTwo = bMinus/twoA;
	}

	public void print( )
	{
      out.printf("rootone :: %.2f\n",rootOne);
      out.printf("roottwo :: %.2f\n",rootTwo);
	}
}