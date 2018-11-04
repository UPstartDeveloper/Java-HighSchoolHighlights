import java.util.Scanner;//package for prompting user input
import java.text.NumberFormat;//package for formatting numeric output

/*
 *Author name: Zain Raza
 *Description: Account class. Includes data members for customer information and methods for customer actions.
 *Due Date: Thursday, January 18, 2017
 */
 
 public class RazaBankClient//class declaration
 {
 	int choice;//stores values 1-4, correspond to whatever command customer wishes
 	Scanner input=new Scanner(System.in);//Scanner allows the ability to take in user input
 	NumberFormat money=NumberFormat.getCurrencyInstance();//NumberFromat for formatting numeric output
 	RazaAccount Monica=new RazaAccount("Monica Allen" , "246810" , 5000.0);//instantiation of Account object
 	RazaAccount John=new RazaAccount("John Smith" , "246811" , 2000.0);//instantiation of Account object
 	
 	//String name;//holds customer name
	//String account;//holds account number
	//double balance;//stores starting balance of account
	//double newBalance;//returned at end of deposit or withdrawal
	//double change;//stors how much customer want to deposit or withdraw
	
	public static void main(String[] args)//main method
	{
	
	//intro information
	System.out.println("\t\t\t\t\t\t\tAlly Bank");//name of bank
	System.out.println("\t\t\t\t\t\t123 Worceser Street");//bank address
	System.out.println("\t\t\t\t\t\t   508-839-5300");//phone number
	System.out.println("\t\t\t\t\t\t www.allybank.com");//web address
	System.out.println("-------------------------------------------------------------------------------------");//divider
	
	//welcoming new customers
	System.out.println("");//blank line for spacing
	System.out.println("Welcome to the Ally Bank New Accounts System");
	System.out.println("");//blank line for spacing
	System.out.println("New Customers :");//start of account displays
	System.out.println("---------------");//divider
	System.out.println("");//blank line for spacing
	
	//displaying all information in test accounts
	Monica.displayAll();
	System.out.println("");//blank line for spacing
	System.out.println("");//blank line for spacing
	John.displayAll();
	System.out.println("");//blank line for spacing
	System.out.println("---------------------");//divider
	
	//account management options
	System.out.println("Accounts Management Menu");//title
	System.out.println("1.  Withdraw funds");//withdraw option
		System.out.println("2.  Deposit funds");//deposit option
			System.out.println("3.  Check balance");//retruns current balance  
				System.out.println("4.  Quit");//ends aaplication for user
	System.out.println("---------------------");//divider
	
	//account management tests
	while(choice!=0)//application continues until user picks 0
	{
	System.out.println("For the account numbered " + Monica.displayAccount() + ":");//uses account number as identification
	System.out.print("Choose an option: ");//user prompt
	choice=input.nextInt();//initialization using Scanner
	System.out.println("");//blank line for spacing
	//decides which function based on choice
	if(choice==1)
	{
		System.out.println("How much would you like to deposit into Account Number " + Monica.displayAccount() + "?"); 
	}
	}
	}	
 }