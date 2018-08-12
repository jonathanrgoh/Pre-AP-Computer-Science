//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";
	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		if(word.indexOf(c)>-1){
			return true;
		}
		else {
			return false;
		}
	}

	public boolean findSubString(String s)
	{
	  for(int i=0; i<s.length(); i++){
	     if(word.indexOf(s.charAt(i))!=-1){
	        //Nothing here...
	     }
	     else {
            return false;
	     }
	  }
	  return true;
	}

 	public String toString()
 	{
 		return word+"\n\n";
	}
}