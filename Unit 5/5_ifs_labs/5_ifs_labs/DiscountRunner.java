//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount discount = new Discount();

		for(int i=0; i<4; i++){
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.printf("Bill after discount :: %.2f\n\n",discount.getDiscountedBill(amt));
		}
	}
}