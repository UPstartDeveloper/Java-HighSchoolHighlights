import java.awt.*;//application Windows toolkit, includes all subclasses
import javax.swing.*;//required class for GUI
import java.awt.event.*;//allows for event controlled programming

/*
 *Author name: Zain Raza
 *Description: GUI which displays a name that is entered by the user
 *Due Date: Monday December 11, 2017
 */
 
 public class RazaEcho extends JFrame implements ActionListener//class declaration
 {
 	JLabel one;//first label
 	JTextField un;//first text box
 	JLabel two;//second label
 	JTextField deux;//second text box
 	
 	public RazaEcho(String title)//constructor
 	{
 		super(title);
 		one=new JLabel("Enter your name:");//label for text box
 		un=new JTextField(15);//will hold 15 characters
 		two=new JLabel("Here is your name:");//label for text box
 		deux=new JTextField(15);//same as un
 		
 		//adding objects to program
 		add(one);
 		add(un);
 		add(two);
 		add(deux);
 		
 		setLayout(new FlowLayout());//set a layout from left to right, gives word wrap
 		
 		un.addActionListener(this);//this field waits for a Enter buttton press
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frames exits on close
 	}
 	
 	public void actionPerformed(ActionEvent evt)//action method
 	{
 		String name=un.getText();//get method for String 
 		deux.setText(name);//setter method
 	}
 
 public static void main(String[] args)//main method
 {
 	RazaEcho Mirror=new RazaEcho("Echo");//creating frame
 		Mirror.setSize(400, 200);//gives dimensions to the frame
 		Mirror.setVisible(true);//makes frame visible to user
 }
 
 }
 	