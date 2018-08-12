//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		Distance test = new Distance(x1,x2,y1,y2);
		test.calcDistance();
		test.print();

		out.print("Enter x1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		test.setCoordinates(x1,x2,y1,y2);
		test.calcDistance();
		test.print();

		out.print("Enter x1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		test.setCoordinates(x1,x2,y1,y2);
		test.calcDistance();
		test.print();
	}
}