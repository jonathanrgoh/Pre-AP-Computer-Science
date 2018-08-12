//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
      Social test = new Social("456-56-234");
      out.println(test);

      test.setWord("1-1-1");
      out.println(test);

      test.setWord("102-2-12");
      out.println(test);

      test.setWord("0-0-0");
      out.println(test);
	}
}