//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

      out.print("Enter 1st monster's name: ");
      String name = keyboard.next();
      out.print("Enter 1st monster's size: ");
      int size = keyboard.nextInt();
      Monster one = new Monster(name,size);

      out.print("\nEnter 2nd monster's name: ");
      name = keyboard.next();
      out.print("Enter 2nd monster's size: ");
      size = keyboard.nextInt();
      Monster two = new Monster(name,size);

      out.println("\nMonster 1 - "+one);
      out.println("Monster 2 - "+two+"\n");

      if(one.isBigger(two))
         out.println("\nMonster one is bigger than Monster two.");
      else
         out.println("Monster one is smaller than Monster two.");

      if(one.namesTheSame(two))
         out.println("\nMonster one has the same name as Monster two.");
      else
         out.println("Monster one does not have the same name as Monster two.");


      out.print("Enter 1st monster's name: ");
      name = keyboard.next();
      out.print("Enter 1st monster's size: ");
      size = keyboard.nextInt();
      one.setInfo(name,size);

      out.print("\nEnter 2nd monster's name: ");
      name = keyboard.next();
      out.print("Enter 2nd monster's size: ");
      size = keyboard.nextInt();
      two.setInfo(name,size);

      out.println("\nMonster 1 - "+one);
      out.println("Monster 2 - "+two+"\n");

      if(one.isBigger(two))
         out.println("\nMonster one is bigger than Monster two.");
      else
         out.println("Monster one is smaller than Monster two.");

      if(one.namesTheSame(two))
         out.println("\nMonster one has the same name as Monster two.");
      else
         out.println("Monster one does not have the same name as Monster two.");


      out.print("Enter 1st monster's name: ");
      name = keyboard.next();
      out.print("Enter 1st monster's size: ");
      size = keyboard.nextInt();
      one.setInfo(name,size);

      out.print("\nEnter 2nd monster's name: ");
      name = keyboard.next();
      out.print("Enter 2nd monster's size: ");
      size = keyboard.nextInt();
      two.setInfo(name,size);

      out.println("\nMonster 1 - "+one);
      out.println("Monster 2 - "+two+"\n");

      if(one.isBigger(two))
         out.println("\nMonster one is bigger than Monster two.");
      else
         out.println("Monster one is smaller than Monster two.");

      if(one.namesTheSame(two))
         out.println("\nMonster one has the same name as Monster two.");
      else
         out.println("Monster one does not have the same name as Monster two.");
	}
}