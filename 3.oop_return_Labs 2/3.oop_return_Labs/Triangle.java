//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;
	}


	public void setSides(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;
	}

	public void calcPerimeter( )
	{
      perimeter = sideA + sideB + sideC;

	}

	public void calcArea( )
	{
		double s;
      s = perimeter / 2;
      theArea = sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	public void print( )
	{
	   System.out.printf("%d %d %d\n",sideA,sideB,sideC);
      System.out.printf("Area == %.5f",theArea);
		System.out.println("\n\n");
	}
}