//*************************************************
//	Author name: Zain Raza
//	
//	Description: RazaSummer2.java
//	Demonstrates the use of do-while and for loops
// 	with an accumulator and reading user input.
//
//	Due Date: August 28, 2018
//************************************************

import java.util.Scanner;

public class RazaSummer2
{
//***************************************************************
//	Prompts the user for the high temperature, then 
//	calculates the average by taking a total via an acculmulator
//	then dividing by 5. Average is outputted back to user.
//***************************************************************
	public static void main(String[] ars)
	{
		Scanner input = new Scanner(System.in);// instaniates Scanner
		double highTemp, total, avgTemp;// stores values for temperatures used throughout program
		//initializing variables
		highTemp = 0;
		total = 0;
		int control;// to be used as accumulator
	
		do// loop prompts user for temperatures
			{
				for(control = 0; control < 5; control++)// loop must end after five prompts
					{
						System.out.print("Enter the high temperature on day " + (control+1) + ": ");//user prompt
						highTemp = input.nextDouble();
						System.out.print("\n");//moves cursor to next to format output
						total += highTemp; //total accumulates total number of degrees from five days	
					}
			
			}while(control < 5);// loop ends after fifth temperature is assigned
			
			avgTemp = total/5;// calculates average temperature for five days
			System.out.println("");// moves cursor to the next line to format output
			System.out.println("The average high temperature is: " + "\t" + avgTemp);// outputs average temperature
	
	}
		
}