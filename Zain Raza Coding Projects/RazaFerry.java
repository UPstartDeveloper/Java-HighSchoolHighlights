import java.text.NumberFormat;
import java.util.Scanner;
/**
 *Author name:Zain Raza
 *Program Name: RazaFerry asks user for number of axles on their car. Computes charge of ferry toll, prints appropiate message back to the user. 
 *Due Date: Monday Sept. 11
 **/ 
 	
 	public class RazaFerry{
 	
 	public static void main(String[] args){
 		
 		int axle;//user inputted
 		double charge;//for ferry toll
 		Scanner input=new Scanner(System.in);
 		NumberFormat money=NumberFormat.getCurrencyInstance();
 		
 		System.out.println("Enter the number of axles on your car: ");
 		axle=input.nextInt();
 		
 	switch (axle) //goes through all possible axle inputs and charges
 		{
 		case 2:
 			charge=3.0;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 3:
 			charge=5.0;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 4:
 			charge=8.5;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 5:	
 			charge=8.5;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 6: 
 			charge=9.5;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 7:
 			charge=10.75;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 8:
 			charge=12.25;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 		case 9:
 			charge=13.5;
 			System.out.println("Ferry toll charge: " + money.format(charge));
 			break;
 			default:
 				System.out.println("Invalid axle number.");
 	}	
 		}
 		}
 
 	
 		