import java.util.Scanner;
import java.lang.String;

/**
 *Author name:Zain Raza
 *Program Name: RazaReviewPacket3 asks user for name. Prints it back to the user with a greeting and the appropiate title. 
 *Due Date: Tuesday Sept. 12
 **/ 
 	
 	public class RazaReviewPacket3{
 		public static void main(String[] args){
 			String name;
 			int end=5;//variable for ending the program
 		
 		Scanner input=new Scanner(System.in);
 		
 		do{
 		    System.out.println("Enter a name: ");//user prompt
 		    name=input.nextLine();
 		   if(name=="Amy") || name=="Buffy" || name="Cathy")//checking for female names
 		   	{
 		       System.out.println("Hello Madam " + name + "!");//female greeting
 		   } 
 		   	else if(name==Elroy || name=Fred || name=Graham)//checking for male names 
 		   		{
 		       System.out.println("Hello Mister " + name + "!");//male greeting
 		   } 
 		   	else {
 		       System.out.println("Hello " + name);//generic greeting
 		       System.out.println("Enter 0 to exit program.");//user prompt for ending program
 		       end=input.nextInt();
 		   }
 		} while(end==0);
 		
 		}
 	}