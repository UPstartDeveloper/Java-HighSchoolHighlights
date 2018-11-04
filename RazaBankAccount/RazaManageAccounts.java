// ****************************************************************
//   Author: Zain Raza
//
//   RazaManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's 
//   bank accounts .

//   Due Date: Thursday, October 25, 2018     
// ****************************************************************
import java.text.NumberFormat;// imports methods for displaying numeric output 


public class RazaManageAccounts
{
    public static void main(String[] args)
    {
	RazaAccount acct1, acct2;
	
	NumberFormat money = NumberFormat.getCurrencyInstance();

	//create account1 for Sally with $1000
	acct1 = new RazaAccount(1000, "Sally", 1111);

	//create account2 for Joe with $500
	acct2 = new RazaAccount(500, "Joe", 1112);

	//deposit $100 to Joe's account
	acct2.deposit(100);

	//print Joe's new balance (use getBalance())
	System.out.println("Joe's new account balance: " + money.format(acct2.getBalance()));

	//withdraw $50 from Sally's account
	acct1.withdraw(50);

	//print Sally's new balance (use getBalance())
	System.out.println("Sally's new balance: " + money.format(acct1.getBalance()));
	System.out.println("");

	//charge fees to both accounts
	System.out.println("Your account was just charged a $10 fee. New balance: " + acct1.chargeFee());
	System.out.println("Your account was just charged a $10 fee. New balance: " + acct2.chargeFee());
	System.out.println("");

	//change the name on Joe's account to Joseph
	acct2.changeName("Joseph");

	//print summary for both accounts
	System.out.println("Account Summary for Sally: ");
	System.out.println(acct1.toString());
	System.out.println("");
	System.out.println("Account Summary for Joseph:");
	System.out.println(acct2.toString());
    }
}