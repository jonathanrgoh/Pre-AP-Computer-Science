//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
	   StringFirstLetterCheck test = new StringFirstLetterCheck("hello","howdy");
	   out.println(test);

	   test.setWords("one","two");
	   out.println(test);

	   test.setWords("three","two");
	   out.println(test);

	   test.setWords("TCEA","UIL");
	   out.println(test);

	   test.setWords("state","champions");
	   out.println(test);

	   test.setWords("ABC","DEF");
	   out.println(test);
	}
}