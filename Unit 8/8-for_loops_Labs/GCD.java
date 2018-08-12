//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCD
{
	private int one, two;

	public GCD()
	{
		one=two=0;
	}

	public GCD(int numOne, int numTwo)
	{
		one=numOne;
		two=numTwo;
	}

	public void setNums(int numOne, int numTwo)
	{
		one=numOne;
		two=numTwo;
	}

	public long getGCD( )
	{
		long gcd=0;
		int a=one;
		int b=two;
		while(a!=0 && b!=0)
		{
			int c = b;
			b = a%b;
			a = c;
		}
		gcd = a+b;
		return gcd;
	}

	public String toString()
	{
		return "the gcd of "+one+" and "+two+" is "+getGCD();
	}
}
