// ***************************************************************
//   RazaSalary.java
//   Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class RazaSalary
{ 
   public static void main (String[] args)
   {
      double currentSalary;  // current annual salary
      String rating;         // performance rating
      double raise = 0;      // dollar amount of the raise

	   Scanner scan = new Scanner(System.in);
	   NumberFormat money = NumberFormat.getCurrencyInstance();

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary (leave out the dollar sign): ");
      currentSalary = scan.nextDouble();
      System.out.print ("Enter the performance rating: ");
      rating = scan.next();

      // Compute the raise -- Use if ... else ...
      // Uses equals() method of the String class in implementing conditions
      if(rating.equals("Excellent"))
      {
      	raise = currentSalary * 0.06;// %6 increase on the current salary 
      }
      else if(rating.equals("Good"))
      {
      	raise = currentSalary * 0.04;// %4 increase on the current salary 
      }
      else if(rating.equals("Poor"))
      {
      	raise = currentSalary * 0.015;// %1.5 increase on the current salary 
      }

      // Print the results
      System.out.println ("Amount of your raise: " + money.format(raise));
      System.out.println ("Your new salary: " + money.format(currentSalary + raise));
   }
}