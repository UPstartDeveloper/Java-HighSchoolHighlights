/*
 *Zain Raza
 *Description: Grade Range has a string array for grade letters and their cutoff values.
 *Due: Wednesday, May 30, 2018
 */
 
 public class RazaGradeRange //class declaration
 {
 	public static void main(String[] args) //main method
 	{
 		String [] letters = {"A" , "A-" , "B+" , "B" , "B-" , "C+" , "C" , "C-" , "D+" , "D", "D-" , "F"}; // array for grade letters
 		String [] cutoff = {"95" , "90" , "87" , "83" , "80" , "77" , "73" , "70" , "67" , "63" , "60" , "0"}; //array for cutoff values
 		
 		System.out.println("Grade Cutoffs: "); //prints title for output
 		for(int i = 0; i < letters.length; i++) //for loop controls printing rest of output
 		{
 			System.out.print(letters[i] + "\t"); //prints letter grade first
 			System.out.println(cutoff[i]); //prints grade value second
 			System.out.println(""); //empty line for spacing
 		}
 	
 }
 
 }
 