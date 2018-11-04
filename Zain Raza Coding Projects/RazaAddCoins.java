import java.util.Scanner;
import java.lang.String;
import java.text.NumberFormat;

/**
 *Zain Raza
 *Sept. 25, 2017
 *RazaAddCoins prompts user for number of 4 coin types, then returns the total amount of money.
 */
 
 public class RazaAddCoins{
 
 	public static String getDollarAmount(int num1, int num2, int num3, int num4){
		double penny=0;
		double nickel=0;
		double dime=0;
		double quarter=0;
		double sum=0;
 		penny=num1*0.01;//calculates value of pennies
 		nickel=num2*0.05;//calculate value of nickels
 		dime=num3*0.1;//calculates value of dimes
 		quarter=num4*0.25;//calculates value of quarters
 		sum=penny+nickel+dime+quarter;//calculates total
 		String total="Total: $"+ sum;
 		return total;
 	} public static void main(String[] args){
 		int num1=0;//number of pennies
		int num2=0;//number of nickels
		int num3=0;//number of dimes
		int num4=0;//number of quarters
		double sum=0;
		Scanner input=new Scanner(System.in);
	System.out.println("Enter your total coins: ");
	System.out.println("");
	System.out.print("Quarters: ");//user prompt 1
	num1=input.nextInt();
	System.out.print("Dimes: ");//user prompt 2
	num2=input.nextInt();
	System.out.print("Nickels: ");//user prompt 3
	num3=input.nextInt();
	System.out.print("Pennies: ");//user prompt 4
	num4=input.nextInt();
	System.out.println(getDollarAmount(num1, num2, num3, num4) + sum);
	

	}


}