/*
 *Author name: Zain Raza
 *Due Date: Monday Nov. 13, 2017
 *Description: StudentAthlete file is derived from Student class. Adds an extra data member.
 */
 
 public class RazaStudentAthlete extends RazaStudent//class declaration
 {
 	String name;
 	String numCourses;
 	String sport;
 	public RazaStudentAthlete(String n, String c, String s)//constructor	
 	{
 		super(n, c);//inherits initialization
 		sport=s;//initialization
 	}
 	 public String toString()//method method
 	 {
 	 	return name + "\n" + numCourses + "\n" + sport;//outputs object with 3 attributes
 	 }
 }
 