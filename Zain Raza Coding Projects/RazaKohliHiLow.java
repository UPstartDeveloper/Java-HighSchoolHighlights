/*
 * Author names: Zain Raza, Raunit Kohli
 *
 * RazaKohliHiLow.java
 * Demonstrates use of Scanner and Random class methods 
 * to make decsions within a nested do while loop.
 *
 * Due Date: Tuesday, October 16, 2018
 */

import java.util.Random;
import java.util.Scanner;

public class RazaKohliHiLow // needed to add class declaration
{
	public static void main(String[] args) { //needs main method declaration
/*
 * Program plays a guessing game with the user, provides feedback whether the gues
 * is too low, too high, or correct.
 */

Random bob = new Random();
Scanner scan = new Scanner(System.in);

int sentinel = 0;
int chosen;
int count;
int guess;

int sentinel_2 = 1; //needed a second sentiel value for do-while loop

chosen=0; //needed to initialized the variable so it can be used in the loop
count=0; //needed to initialized the variable so it can be used in the loop
guess=0; //needed to initialized the variable so it can be used in the loop

do {
	
	chosen = bob.nextInt(100) + 1; //needed to be placed INSIDE the do-while loop
	guess = 0; //needed to reinitiate guess variable
	sentinel = 0; //needed to reinitiate sentinel value

	while (guess != chosen && sentinel == 0)
	{
		System.out.print("Enter a guess: ");
		guess = scan.nextInt();
	
		if (guess > 100 || guess < 1) //needed to move the else-if statement top the top of the if/elif structure
		{
			System.out.println("Guess invalid. Please enter a number between 1 and 100.");
		}
		else if (guess == sentinel) //useless else-if statement 
		{
		
		}
		else if(guess > chosen)
		{
			System.out.println("Your guess is too high.");
			count++;
		}
		else if( guess < chosen)
		{
			System.out.println("Your guess is too low.");
			count++;
		}
		else if( guess == chosen )
		{
			System.out.println("You win!" + " Number of Guesses: " + count);
		}
		System.out.print("Enter 0 if you would like to guess again: ");
		sentinel = scan.nextInt();
		
	} 
	
	System.out.print("Enter 1 if you would like to play again. Else you may enter 0.");
	sentinel_2=scan.nextInt(); //needed to add statement to take in user input
	
	} while(sentinel_2 == 1); //needed to change sentinel to sentinel_2
}
}