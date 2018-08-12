//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
      first = "";
      last = "";
      sum = "";
   }

   public AddStrings(String one, String two)
   {
      first = one;
      last = two;
   }

   public void setStrings(String one, String two)
   {
      first = one;
      last = two;
   }

 	public void add( )
 	{
 	 sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output="";
 		output = String.format("first :: %s\nlast :: %s\nsum :: %s\n\n",first,last,sum);
 		return output;
	}
}