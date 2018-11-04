//****************************************************
//	Author name: Zain Raza
//	
//  Description:
//	RazaSummerWork1.java
//	Demonstrates the use of an if/else statement 
//	using the Scanner class.
//
//  Due Date: August 28, 2018
//****************************************************
 
import java.util.Scanner;
import java.text.DecimalFormat;

public class RazaSummer1
{
	//****************************************************
	//	Calculates an ideal weight for a person based on
	//	gender and given height.
	//****************************************************
	public static void main (String [] args)
	{
		String gender = "";// stores user gneder
		boolean overFive; //stores true if the user is 5 ft or taller
		double height = 0; // stores the number of inches a person is taller than 5 feet by
		final double men, women, conversionFactor; 
			men = 50.0; // men must add 50 kg. to calculate ideal weight
			women = 45.5; // women must add 45.5 kg. to calculate ideal weight
			conversionFactor = 2.2; // output in lb. is equal to output in kg. multipied by 2.2
		double idealWeightKg, idealWeightLb; // stores ideal weight in kg. 
		
		Scanner input = new Scanner(System.in); // instaniates Scanner object
		DecimalFormat form = new DecimalFormat("##.00"); // instaniation of DecimalFormat object to round output to two places
		
		System.out.println("Are you at least 5 feet tall? Enter \"true\" if so and \"false\" if not: ");// user input is technically case insensitive
		overFive = input.nextBoolean();
		
		if(overFive) // if the user is at least 5 feet tall
		{
			System.out.println("Enter gender (only accepting \"male\" or \"female\" at this time): "); // user prompt for gender
			gender = input.next();	
				if (gender == "male") // user is male
				{
					System.out.println("By how many inches are you taller than 5 feet? "); // user prompt for inches over 5 feet
					height = input.nextDouble();
					idealWeightKg = men + (2.3 * height); // calculates ideal weight in kilograms
					idealWeightLb = idealWeightKg * conversionFactor; // converts ideal weight in kilograms to pounds
					System.out.println("Ideal Weight (in kilograms): " + idealWeightKg + "\n" + "Ideal Weight (in pounds): " + idealWeightLb); // displays output
				}
				else // the user is female
				{
					System.out.println("By how many inches are you taller than 5 feet? "); // user prompt for inches over 5 feet
					height = input.nextDouble();
					idealWeightKg = women + (2.3 * height); // calculates ideal weight in kilograms
					idealWeightLb = idealWeightKg * conversionFactor; // converts ideal weight in kilograms to pounds
					System.out.println("Ideal Weight (in kilograms): " + (form.format(idealWeightKg)) + "\n" + "Ideal Weight (in pounds): " + (form.format(idealWeightLb))); // displays output
				}
		}
		else // of the user is shorter than 5 feet tall 
		{
			System.out.println("Sorry, unfortunately this system cannot calculate yourr ideal weight."); // informs user the formula will not work for them
		}
	}
}