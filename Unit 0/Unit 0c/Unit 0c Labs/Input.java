//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo, intTotal, byteTotal, shortTotal;
		double doubleOne, doubleTwo, doubleTotal;
		float floatOne, floatTwo, floatTotal;
		short shortOne, shortTwo;
		long longOne, longTwo, longTotal;
		byte byteOne, byteTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

intTotal = intOne + intTwo;

		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();

doubleTotal = doubleOne + doubleTwo;

		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();

floatTotal = floatOne + floatTwo;

		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();

shortTotal = shortOne + shortTwo;

		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();

longTotal = longOne + longTwo;

		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();

byteTotal = byteOne + byteTwo;

		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("intTotal = " + intTotal );

		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("doubleTotal = " + doubleTotal );

		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("floatTotal = " + floatTotal );

		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		System.out.println("shortTotal = " + shortTotal );

		System.out.println("long one = " + longOne );
		System.out.println("long two = " + longTwo );
		System.out.println("longTotal = " + longTotal );

		System.out.println("byte one = " + byteOne );
		System.out.println("byte two = " + byteTwo );
		System.out.println("byteTotal = " + byteTotal );

		//add in output for all variables


	}
}