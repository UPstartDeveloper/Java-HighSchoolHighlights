/*
 *Author name: Zain Raza
 *Due Date: Nov. 13, 2017
 *Description: Client code for UniversityEmployee, Faculty, and Staff classes/
 */
 
 public class UEmployeeClient//class declaration
 {
 	//object creation
 	UniversityEmployee Zain=new UniversityEmployee("Mr. Raza" , "$100,000");//myself as UniversityEmployee obect
 	UniversityEmployee Geronimo=new University("Mr. Bernstein" , "$75,000");//UniveristyEmployee object
 	Faculty James=new Faculty("Mr. Pignataro" , "$100,000" , "Computer Science");//computer science professor as Faculty object
 	Faculty John=new Faculty("Mr. Kelly" , "$80,000" , "History");//history professor as Faculty object
 	Staff Rakesh=new Staff("Mr. Khusrana" , "900,000" , "Dean");//dean as Staff object
 	Staff Drew=new Staff("Mrs. Faust" , "$800,00" , "Presient");//president as Staff object
 	 
 	//meaningful output
 	System.out.println("The name of the Computer Science teacher is: " + James.returnName());//using returnName method
 	System.out.println("Salary of Professor of History, Mr. Kelly: " + John.returnSalary());//using returnSalaray method
 	System.out.println("Department of Professor Pignataro: " + James.returnDepartment());//using returnDepartment method
 	System.out.println("Job Title of Mr.Khusrana: " + Rakesh.returnJobTitle());//using returnJobTitle method
 }