//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		for(int i=0; i<5; i++){
			out.print("Enter a whole number :: ");
			int amt = keyboard.nextInt();
			System.out.printf("%d is odd :: %b\n",amt,NumberVerify.isOdd(amt));
			System.out.printf("%d is even :: %b\n\n",amt,NumberVerify.isEven(amt));
		}
	}
}