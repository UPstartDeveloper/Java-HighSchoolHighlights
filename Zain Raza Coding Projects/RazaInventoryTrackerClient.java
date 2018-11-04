import java.util.Scanner;//imports Scanner class

/**
 *Author name: Zain Raza
 *Due Date: Friday October 13, 2017
 *Description: Client cide for InventoryTracker application. Contains main method.
 */ 
 	public class RazaInventoryTrackerClient{
 		public static void main(String[] args){
 			Scanner input=new Scanner(System.in);//instantiates Scanner
			int choice;//stores user choice of methods
 			int stock;//stores the stock of the item
 			int change;//stores amount user want to add/subtract from stock
 			RazaInventoryTrackerClass item=new RazaInventoryTrackerClass();//instantiates item
 			do{//continually iterates program
 				System.out.println("1. Show current inventory.");//displays option 1
 				System.out.println("2. Add to current inventory.");//displays option 2
 				System.out.println("3. Decrease the current inventory.");//displays option 3
 				System.out.println("Enter 0 to quit.");//option to end loop
 				System.out.print("Enter your choice: ");//user prompt
 				choice=input.nextInt();//assigns choice to user input
 				if(choice==1){//user chooses option 1
 					item.displayStock();//displays inventory
 					System.out.println("");//moves cursor to next line
 				} else if(choice==2){//user chooses option 2
 					System.out.print("Enter amount you want to add: ");//user prompt
 					change=input.nextInt();//assigns variable
 					System.out.println("");//creates space to format output
 					stock=(item.addStock(change));//completes option 2
 					System.out.println("");//creates space to format output
 				} else if(choice==3){//user chooses option 3
 					System.out.print("Enter amount you want to subtract from the inventory: ");//user prompt
 					change=input.nextInt();//assigns variable
 					item.subtractStock(change);//completes option 3
 					System.out.println("");//mivs cursor to next line
 				}
 			}while(choice!=0);//program ends when user inputs 0
 		}
 	}