/**
 * Author name: Zain Raza
 * 
 * RazaStudentGrades.java
 * Displays a table containing the names of
 * five students alongside their grades earned.
 *
 * Due Date: Monday, September 10, 2018
 */
public class RazaStudentGrades
{
	/**
	 * Prints a border on top using 
	 * front and back slashes.
	 */
	 public static void topBorder()
	 {
	 	System.out.print("///////////////////");
		for(int i = 0; i < 19; i++)
			{
				System.out.print("\\");
			}
	 }
	 /**
	 * Prints a border on bottom using 
	 * back and front slashes.
	 */
	 public static void bottomBorder()
	 {
		for(int i = 0; i < 19; i++)
			{
				System.out.print("\\");
			}
		System.out.print("///////////////////");
	 }
	 
	 /**
	  * Prints table with list of names and grades
	  * to display use of tab spacing and string concatenation.
	  */
	  
	  public static void table()
	  {
	  	System.out.println("Name\t\t\t" + "Lab\t\t" + "Bonus\t" + "Total");// categories in table
	  	System.out.println("----\t\t\t" + "---\t\t" + "-----\t" + "-----");
	  	//----------------------------------------------------------------
	  	// Beginning list of names and grades
	  	//----------------------------------------------------------------
	  	System.out.println("Zain\t\t\t" + "50 \t\t" + "5    \t" + "55");
	  	System.out.println("Jean-Mitchell\t" + "38 \t\t" + "10    \t" + "48");
	  	System.out.println("Obi\t\t\t\t" + "35 \t\t" + "8    \t" + "43");
	  	System.out.println("Mary Jane\t\t" + "47 \t\t" + "6    \t" + "53");
	  	System.out.println("Pac-Man\t\t\t" + "53 \t\t" + "7    \t" + "60");
	  }
	 
	public static void main(String[] args)
	{
		topBorder();
		System.out.print("\n");// moves cursor to next line
		System.out.println("==\t\t" + "    Student Points \t\t\t==");// title of table
		bottomBorder();
		System.out.print("\n");// moves cursor to next line
		table();
	}
	
}