//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
	private String word;

	public Box()
	{
	  word = " ";
	}

	public Box(String s)
	{
	  word = s;
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
      for(int i=0;i<word.length();i++)
      {
      	out.println(word);
      }
      out.print("\n\n");
	}
}