//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	  socialNum = "";
	}

	public Social(String soc)
	{
	  socialNum = soc;
	}


	public void setWord(String w)
	{
	  socialNum = w;
	}

	public void chopAndAdd()
	{
      String subA = socialNum.substring(0,socialNum.indexOf('-'));
      String subB = socialNum.substring(socialNum.indexOf('-')+1,socialNum.lastIndexOf('-'));
      String subC = socialNum.substring(socialNum.lastIndexOf('-')+1,socialNum.length());
      sum = Integer.parseInt(subA)+Integer.parseInt(subB)+Integer.parseInt(subC);

	}

	public String toString()
	{
	    chopAndAdd();
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}