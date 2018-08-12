//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster
{
	private String name;
	private int howBig;

	public Monster()
	{
      name=" ";
      howBig=0;
	}

	public Monster(String n, int size)
	{
     name=n;
     howBig=size;
	}

   public void setInfo(String n, int size)
   {
      name=n;
      howBig=size;
   }

	public String getName()
	{
		return name;
	}

	public int getHowBig()
	{
		return howBig;
	}

	public boolean isBigger(Monster other)
	{
     if(howBig>other.getHowBig())
         return true;
      else
         return false;
	}

	public boolean isSmaller(Monster other)
	{
	  if(!isBigger(other))
	     return true;
	  else
	     return false;
	}

	public boolean namesTheSame(Monster other)
	{
	  if(name.equals(other.getName()))
		  return true;
	  else
	     return false;
	}

	public String toString()
	{
		return getName() + " " + getHowBig();
	}
}