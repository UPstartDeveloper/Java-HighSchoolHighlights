/*
 * Author: Zain Raza
 *
 * RazaFactorialExample.java
 * Demonstrates use of a while loop in printing 
 * the product that acculmulates several factors.
 *
 * Due Date: Thursday, September 27, 2018
 */

import java.util.Scanner;

public class RazaFactorials
{
	public static void main(String[] args)
	{
/*
 * An example of calculating a factorial in Java.
 * Only requires the Scanner object
 * and a loop.
 */
		int input = -1, num; // num will be used for calculation, input is displayed to user
		Scanner scan = new Scanner(System.in);
		
		while (input < 0)
		{
			System.out.print("Enter an non-negative integer: ");
			input = scan.nextInt(); // reads user input
			
			if (input < 0)
			{
				System.out.println("That is not a non-negative integer. Please enter an " +
									"integer that is greater than 0.");
			} 
		}
		
		num = input + 1;	
/*
 * The factorial of any positive integer is equal to the factorial of the integer
 * greater than it by 1, divided by that integer (!num = !(num + 1) / (n + 1)
 * This loops sets n + 1 to the product of itself and the next integer 
 * that is 1 less than the last factor
 */
		int i = num - 1;
		while (i > 1)
		{
			num = num * i;
			i -= 1;
		}
		
		num = num / (input + 1);
		
		System.out.println("The factorial of " + input + " equals " + num);
	}
	
}