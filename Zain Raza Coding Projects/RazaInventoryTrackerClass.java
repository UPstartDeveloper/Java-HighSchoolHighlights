/**
 *Author name: Zain Raza
 *Due Date: Friday October 13, 2017
 *Description: Class file for InventoryTracker application. Contains Item class, variables, and methods.
 */ 
 	public class RazaInventoryTrackerClass{//class declaration
 		int choice;//stores user choice of methods
 		int stock;//stores the stock of the item
 		int change;//stores amount to add/subtract from inventory
 		public RazaInventoryTrackerClass(){//constructor
 			choice=5;//choice begins at 5
 		}
 		public int addStock(int change){
 			stock+=change;//adds user input to stock
 			return stock;
 		}
 		public int subtractStock(int change){
 			stock=stock-change;//subtracts user input from stock
 			return stock;
 		}
 		public void displayStock(){
 			System.out.println("Currently in-stock: " + stock);//prints current inventory
 		}
 	}