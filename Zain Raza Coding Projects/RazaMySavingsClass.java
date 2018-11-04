/**
 *Author name: Zain Raza
 *Description: Class code for MySavings application. Contains user defined class, objects, and methods.
 *Due Date: Oct. 12, 2017
 */
 import java.text.NumberFormat;
 
 public class RazaMySavingsClass{//class declaration
 int coin=0;//stores total amount of coins in account
 double total=0;//stores balance of account
 double CinC=0;//stores change in currency being added or subtracted from account
 int continuer=5;//stops the program when equal to 0
 	NumberFormat money=NumberFormat.getCurrencyInstance();//needed for options 1 and 6
 	public RazaMySavingsClass(){
 	RazaMySavingsClass account=new RazaMySavingsClass();//creates account object
 } public void showTotal(){//option 1
		System.out.println("You have: " + money.format(total));//shows balance within account 
 } public int addCoins(){
		coin+=1;
		return coin;
 } public double addPenny(){//option 2
 	total=total+CinC;
 	return total;
 } public double addNickel(){//option 3
 	total=total+CinC;
 	return total;
 } public double addDime(){//option 4
 	total=total+CinC;
 	return total;
 } public double addQuarter(){//option 5
 	total=total+CinC;
 		return total;
 } public double takeMoney(){//option 6
 	if(CinC>total){
 	System.out.println("There isn't this much money in the bank.");//informs the user that withdrawal amount is too high	
 	}
 	else{
 		total=total-CinC;	
 	} return total;//format and put in a print statement
 	}
 }
 