//***********************************************
// Author name: Zain Raza
//
// RazaMultiplicationTable.java
// Demonstrates use of a nested for loop.
//
// Due Date:  Tuesday, Sept. 25, 2018
//***********************************************

public class RazaMultiplicationTable
{
	public static void main(String[] args)
	{
/*
 * Printing border for multiplication table of integers 1-12
 */
		final int ROWBORDER = 12;
		final int COLUMNBORDER = 12;
		
	System.out.print("\t|");
	
	for (int i = 1; i <= 12; i++)
	{
		System.out.print( i + "\t");
	}
		
		for ( int j = 1; j <= 12; j++)
		{
			
		}
	
		
/*
 * Utilizes outer loop to print rows and 
 * inner loop to print columns for a 
 * multiplication table for integers 1-12
 */
 
 	for (int rowValue = 1; rowValue <= 12; rowValue++)
 	{
 		for (int columnValue = 1; columnValue <= 12; columnValue++)
 		{
 			System.out.print(rowValue * columnValue + "\t"); 		
 		}
 			
 		System.out.println("\n");
 	}
 
	}
}
