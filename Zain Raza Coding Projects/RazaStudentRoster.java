import java.util.Scanner; //imports Scanner package

/*
 *Student name: Zain Raza
 *Description: Application prompts user for number of students in the class. It then asks for each student's name, and prints all of them back to user at the end.
 *Due Date: Wednesday May 23, 2018
 */
 
 public class RazaStudentRoster //class declaration
 {
 	public static void main(String[] args) //main method declaration
 	{
 		Scanner input=new Scanner(System.in); //creates Scanner object
 		String[] names; //declares array object that stores names as Strings
 		String newName = ""; //stores name that user is adding to array
 		int num=0; //stores number of names in the class
 	 
 		System.out.print("Enter number of students: "); //user prompt
 		num=input.nextInt(); //initialization
 		System.out.println(""); //creates spacing
 		names = new String[num]; //allocates space in array according to user input
 		
 		for (int i = 0; i < names.length; i++) //for each loop for populating the array
 		{
 			System.out.print("Enter name of student: "); //user prompt
 			names[i] = input.next(); //intialization
 		}
 		
 		System.out.println(""); //creates spacing
 		System.out.println("\tStudent Roster"); //title of roster
 		 
 		for (int n = 0; n < names.length; n++) //for each loop for populating the array
 		{
 			int t = n + 1; //stores number on list
 			System.out.println(t + ". " + names[n]); //prints out numbered list
 		}
 	}
 } 
 