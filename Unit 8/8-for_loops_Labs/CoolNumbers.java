//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CoolNumbers
{

	public static boolean isCoolNumber( int num )
	{
		 if(num%3==1&&num%4==1&&num%5==1&&num%6==1)
		   return true;
		 else
		   return false;
	}


	public static int countCoolNumbers( int stop )
	{
	  int coolNumbers = 0;
	  for(int i=0;i<stop;i++)
	  {
	     if(isCoolNumber(i))
	     {
	     	coolNumbers = coolNumbers + 1;
	     }
	  }
		return coolNumbers;
	}
}