import java.text.NumberFormat;//package for formatting numeric output

/*
 *Author name: Zain Raza
 *Description: Account class. Includes data members for customer information and methods for customer actions.
 *Due Date: Thursday, January 18, 2017
 */

public class RazaAccount//class declaration
{
	String name;//holds customer name
	String account;//holds account number
	double balance;//stores starting balance of account
	double newBalance;//returned at end of deposit or withdrawal
	double change;//stors how much customer want to deposit or withdraw
	NumberFormat money=NumberFormat.getCurrencyInstance();//NumberFromat instantiation
	
	//constructor
	public RazaAccount(String n, String a, double b)
	{
		//initializating variables
		name=n;
		account=a;
		balance=b;
	}
	
	public double deposit()//customer wishes to deposit into account
	{
		newBalance=change+balance;//new balance is calculated
		return newBalance;
	}
	
	public double withdraw()//customer wishes to withdraw from account more than what they have
 	{
 	if(change>balance)//withdrawal amount less than money already in the account
 	{
 		System.out.println("***Insufficient funds***");//error messgae printed to user
 	}
		else
		{
			newBalance=balance-change;//new balance is calculated	
		}
	return newBalance;
 	}

	public double getBalance()//customer wishes to get account balance
	{
		return balance;
	}
	
	public String getAccount()//customer wishes to get account number
	{
		return account;
	}

	public void displayAll()//displays all information
	{
		System.out.println("Name: " + name);//displays name
		System.out.println("Account Number: " + account);//displays account number
		System.out.println("Balance: " + money.format(balance));
	}
	
	public void displayName()//displays name
	{
		System.out.println("Name: " + name);//displays the name that account is under
	}
	
	public void displayAccount()//displays account number
	{
		System.out.println("Account Number: " + account);//displays account number
	}
	
	public void displayBalance()//displays account balance
	{
		System.out.println("Balance: " + money.format(balance));
	}
}
