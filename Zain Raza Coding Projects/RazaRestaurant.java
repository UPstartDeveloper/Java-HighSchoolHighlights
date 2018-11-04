import java.awt.*;//Application Windows Toolkit
import javax.swing.*;//swing package required for GUI
import java.awt.event.*;//Event programming package

/*
 *Author name: Zain Raza
 *Description: Restaurant GUI which incorporates all previous GUI components (basic example).
 *Due Date: Unknown
 */
 
 public class RazaRestaurant extends JFrame//class declaration
 {
 	//double values hold order of each item, total cost,  sales tax, and subtotal values
 	double orderSand, orderFries, tax, preTotal, subTotal;
 	
 	//button calculates cost when clicked
 	JButton placeOrder;
 	
 	//labels indicate title, what each text box indicates, as well as sales tax %
 	JLabel top, order1, order2, last1, last2, sales, total, enter;
 	
 	//text box to display order amounts and cost
 	JTextField O1, O2, L1, L2, L3;
 	
 	//drop down menu for indicating if order is for-here or to-go
 	JComboBox choice;
 	
 	//constructor
 	public RazaRestaurant(String title)
 	{
 		super(title);//initialization
 		
 		placeOrder=new JButton("Place Order");//button at bottm of frame
 		
 		top=new JLabel("WELCOME to Raza's World Famous Burgers and Fries!");//title of window
 		enter=new JLabel("Enter # of Burgers and Fries; 0 if none");//above all text boxes
 		order1=new JLabel("Chesseburgers @ $2.99 each");//cost of burgers
 		order2=new JLabel("Fries @ $0.99 each");//cost of fries
 		sales=new JLabel("Sales Tax: 15%");//15% sales tax, next to button
 		last1=new JLabel("Charge for Burgers");//next to first output box
 		last2=new JLabel("Charge for Service");//next to second output box
 		total=new JLabel("Total Bill");//label next to subtotal box
 		
 		//each text box allows 7-character Strings
 		O1=new JTextField(7);//user inpt for burgers
 		O2=new JTextField(7);//user input for fries
		L1=new JTextField(7);//program outputs cost of burgers
		L2=new JTextField(7);//program outputs cost of fries
 		L3=new JTextField(7);//program outputs subtotal
 		
 		String [] twoChoice = {"For here" , "To go"};//creates array
 		choice=new JComboBox(twoChoice);//initialization
 		
 	}
 	
 }