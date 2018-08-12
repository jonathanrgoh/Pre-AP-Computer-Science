//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
	  number = num;
	  stop = end;
	}

	public void setTable(int num, int end)
	{
	  number = num;
	  stop = end;
	}

	public void printTable( )
	{
	  out.println("multiplication table for "+number);
	  for(int i=1;i<stop+1;i++)
	  {
	  {
	  	 out.print(i+"\t");
	     out.println(i*number);
	  }
	  }
	  out.print("\n\n");
	}
}