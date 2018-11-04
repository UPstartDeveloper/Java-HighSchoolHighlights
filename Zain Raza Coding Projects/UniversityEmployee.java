/*
 *Author name: Zain Raza
 *Due Date: Nov. 13, 2017
 *Description: UniversityEmployee class contains member variables for name and salary, and methods for returning both.
 */

public class UniversityEmployee//class declaratiom
{
	String name;//employee name
	String salary;//value that is not operated upon
	public UniversityEmployee(String n, String s)//constructor
	{
		name=n;//initialization
		salary=s;//initialization
	}
	public String returnName()
	{
		return name;//returns employee name
	}
	public String returnSalary()
	{
		return salary;//returns empoyee salary
	}
}