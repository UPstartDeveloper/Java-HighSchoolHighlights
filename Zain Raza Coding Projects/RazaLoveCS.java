// ****************************************************************
//   RazaLoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************

import java.util.Scanner;

public class RazaLoveCS
{
    public static void main(String[] args)
    {
	// final int LIMIT = 10;
	Scanner scan = new Scanner(System.in);
	int limit; // stores user input of how many times to execute print statement
	int count = 1;
	int sum = 0; // stores the sum of all the list numbers 
	
	System.out.print("How many times would you like to print \"I love Computer Science!!\"? ");
	limit = scan.nextInt();

	while (count <= limit)
	{
	    System.out.println(count + " I love Computer Science!!");
	    sum += count;
	    count++;
	}
	
	System.out.println(); // cursor skips a line for formatting
	System.out.print("Printed this message " + limit + " times.");
	
	if (limit != 0)
	{
	System.out.print(" The sum of the numbers from 1 to " + limit + " is " + sum);	
	}
	else // if user inputted 0 for limit
	{
	System.out.println(" The sum of the numbers added is " + sum);
	}
    }
}