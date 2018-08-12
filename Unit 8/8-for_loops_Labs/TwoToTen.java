//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
		binary = "";
	}

	public TwoToTen(String bin)
	{
		binary = bin;
	}

	public void setTwo(String bin)
	{
		binary = bin;
	}

	public long getBaseTen( )
	{
		long n = Long.parseLong(binary);
		long ten=0;
		int i = 0;
		while(n != 0)
		{
			int r = (int)(n % 10);
			if(r != 0)
				ten += (long)Math.pow(2,i);
			i++;
			n /= 10;
		}
		return ten;
	}

	public String toString()
	{
		return binary+" == "+getBaseTen();
	}
}
