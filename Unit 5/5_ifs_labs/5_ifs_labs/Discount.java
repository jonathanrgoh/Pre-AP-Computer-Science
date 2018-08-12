//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	private static final double discountPoint = 2000.00;


	public static double getDiscountedBill(double bill)
	{
		if(bill>discountPoint) {

		return bill*0.85;
		}
		return bill;
	}
}