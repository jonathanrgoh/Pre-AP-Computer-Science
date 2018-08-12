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
   	first="a";
   	last="a";
   }

   public AddStrings(String one, String two)
   {
   	first=one;
   	last=two;
   }

   public void setStrings(String one, String two)
   {
   	first=one;
   	last=two;
   }

 	public void add( )
 	{
 		sum=first+" "+last;
 		sum.toString();
	}

 	public String toString()
 	{
 		String output="";
 		out.println("first :: " + first);
 		out.println("last :: " + last);
 		out.println("sum :: " + sum);
 		out.println("\n");
 		return output;
	}
}