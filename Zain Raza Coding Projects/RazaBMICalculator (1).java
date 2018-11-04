	import java.util.Scanner;
/**
 *Author name:Zain Raza
 *Program Name: RazaBMICalculator asks user for height (in inches) and weight (in pounds). Computes their body mass index, prints it back to the user. Prints information from Department of Health and Human Services/National Institutes of Health so user can compare their BMI to underweight, normal, and obesity standards.
 *Due Date:Monday Sept. 11
 **/ 
 	
 	public class RazaBMICalculator(1) {
 		public static void main(String[] args){
 		
 			double height;//in inches
 			double weight;//in pounds
 			double bmi; 
 			
 			Scanner input=new Scanner(System.in);
 			System.out.println("Enter height in inches. Remember that in 1 foot there are 12 inches: ");//asks uswer for height, includes conversion facotr in case user only knows height in feet
 			height=input.nextDouble();
 			System.out.println("Enter weight in pounds: ");//asks user for weight
 			weight=input.nextDouble();
 				bmi=(weight*703)/(height*height);//bmi="Body Mass Index
 			
 			System.out.println("Body Mass Index (BMI): " + (float)bmi);//prints user's BMI
 			System.out.println("BMI VALUES:");
 			System.out.println("Underweight: less than 18.5");
 			System.out.println("Normal: between 18.5 and 24.9");
 			System.out.println("Overweight: between 25 and 29.9");
 			System.out.println("Obese: 30 or greater");//Standards for BMI
 		}
 	}