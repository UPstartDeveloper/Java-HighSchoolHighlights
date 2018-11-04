/*
 *Author name: Zain Raza
 *Due Date: Nov. 13, 2017
 *Description: Faculty class inherits UniversityEmployee, and contains members for storing and returning dept. name.
 */
 
 public class Faculty extends UniversityEmployee//class declaration
 {
 	String dept;//stores department name
 	public Faculty(String n, String s , String d)//constructor
 	{
 		super(n, s);//initialization
 		dept=d;//initialization
 	}
 	public String returnDepartment()
 	{
 		return dept;//returns deptartment name
 	}
 }