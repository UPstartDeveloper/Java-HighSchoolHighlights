/*
 *Author name: Zain Raza
 *Due Date: Monday Nov. 13, 2017
 *Description: Academics file is the client code for Student and StudentAthlete classes.
 */
 
 public class RazaAcademics extends RazaStudent//class declaration
 {
 	RazaStudent Abraham=new RazaStudent("Abraham" , "7");//new object, parameters from Student
 	RazaStudent Mercedes=new RazaStudent("Mercedes" , "7");//new object
 	RazaStudentAthlete Arnold=new RazaStudentAthlete("Arnold" , "7" , "Baseball");//object from StudentAthlete
 	
 	Abraham.toString();//prints data to user
 	Mercedes.toString();//displays object info
 	Arnold.toString();//diplays output
 }