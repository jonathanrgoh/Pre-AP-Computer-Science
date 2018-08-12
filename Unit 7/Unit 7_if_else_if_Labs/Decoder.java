//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Decoder
{
	private char letter;

	public Decoder()
	{
      letter = ' ';
	}

	public Decoder(char let)
	{
      letter = let;
	}

	public void setLetter(char let)
	{
      letter = let;
	}

	public char deCode()
	{
	  char result = ' ';
	   if(letter>=65&&letter<91)
	     result=(char)(letter+32);
	   else if(letter>=97&&letter<123)
	     result=(char)(letter-32);
	   else if(letter>=48&&letter<58)
	     result=(char)(letter+17);
	   else
	     result='#';
	   return result;
	}

	public String toString()
	{
		return letter+" decodes to "+deCode();
	}
}