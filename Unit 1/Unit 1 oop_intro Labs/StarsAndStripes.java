//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jonathan Goh
//Date - 2/26/14
//Class - 6th Period
//Lab  - 1.oop

import static java.lang.System.*;

public class StarsAndStripes
{
   public static void main(String[] args)
   {

   }
   public void StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      printASmallBox();
      printTwoBlankLines();
      printABigBox();
   }

   public void printTwentyStars()
   {
   	out.println("********************");
   }

   public void printTwentyDashes()
   {
   	out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
   	out.println("\n\n");
   }

   public void printASmallBox()
   {
   	printTwentyDashes();
   	printTwentyStars();
   	printTwentyDashes();
   	printTwentyStars();
   	printTwentyDashes();
   	printTwentyStars();
   	printTwentyDashes();
   }

   public void printABigBox()
   {
   	printASmallBox();
   	printASmallBox();
   }

}