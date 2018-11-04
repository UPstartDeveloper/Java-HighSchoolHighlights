/**
 *Author name: Zain Raza
 *Description: Client code for MySavings application. Contains main method, which has a do-while statement for using all the user-defined methods.
 *Due Date: Oct. 12, 2017
 */
 
import java.util.Scanner;

public class RazaMySavingsClient{

	public static void main(String[] args){
		RazaMySavingsClass account=new RazaMySavingsClass();//creates account object
 int coin=0;//stores total amount of coins in account
 double total=0;//stores balance of account
 double CinC=0;//stores change in currency being added or subtracted from account
 int continuer=10;//stops the program when equal to 0, represents user selection
 Scanner input=new Scanner(System.in);//for prompting user input
	do{
	System.out.println("1. Show total in bank.");//user prompt 1
	System.out.println("2. Add a penny.");//user prompt 2
	System.out.println("3. Add a nickel.");//user prompt 3
	System.out.println("4. Add a dime.");//user prompt 4
	System.out.println("5. Add a quarter.");//user prompt 5
	System.out.println("6. Take money out of the bank.");//user prompt 6	
	System.out.println("Enter 0 to quit");//user prompt to end program
	continuer=input.nextInt();
	if(continuer==1){
		account.showTotal();//prints account balance
	} else if(continuer==2){
		coin=coin+1;//adds a coin to account
		account.addPenny();//adds .01 to account balance
	} else if(continuer==3){
		coin=coin+1;//adds a coin to account
		account.addNickel();//adds .05 to account balance
	} else if(continuer==4){
		coin=coin+1;//adds a coin to account
		account.addDime();//adds .1 to account balance
	} else if(continuer==5){
		coin=coin+1;//adds a coin to account
		account.addQuarter();//adds .25 to account balance
	} else if(continuer==6){
		System.out.print("How much money do you want to take out?");//user prompt
		CinC=input.nextDouble();
		System.out.println("");//puts output on next line
		account.takeMoney();//handles withdrawal
	} while(continuer!=0)
	} 
}
}