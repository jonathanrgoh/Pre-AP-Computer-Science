//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthCheck
{
	String wordOne, wordTwo;

	public StringLengthCheck()
	{
	  wordOne = "";
	  wordTwo = "";
	}

	public StringLengthCheck(String one, String two)
	{
	  wordOne = one;
	  wordTwo = two;
	}

	public void setWords(String one, String two)
	{
	  wordOne = one;
	  wordTwo = two;
	}

	public boolean checkLength( )
	{
	   if(wordOne.length() == wordTwo.length())
		    return true;
	   else
		    return false;
	}

	public String toString()
	{
	  if(checkLength())
	     return wordOne + " has the same # of letters as " + wordTwo + "\n";
	  else
		  return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
	}
}