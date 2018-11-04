import java.awt.*;//Applications Windows toolkit package
import java.awt.event.*;//Event package
import javax.swing.*;//Java swing package

/*
 *Zain Raza
 *December 12, 2017 
 *Frame accepts input for Celsius temperature and outputs equivalent temperature in Fahrenheit.
 */
 
 public class RazaFahrConvert extends JFrame implements ActionListener//class delcaration
 {
 	JLabel heading = new JLabel("Convert Fahrenheit to Celsius");//title of program
 	JLabel inLabel = new JLabel("Celsius   ");//label on Celsius text field
 	JLabel outLabel = new JLabel("Fahrenheit     ");//label on Fahrenheit text field
 	
 	JTextField inCel = new JTextField(7);//allows for a 7-character String input
 	JTextField outFahr = new JTextField(7);//allows for an input of maximum length 7 character
 	
 	int fahrTemp;//Fahrenheit temp. value
 	int celsTemp;//Celsius temp. value 
 
 	RazaFahrConvert(String title)//constructor
 	{
 		//initialization
 		super(title);
 		setLayout(new FlowLayout());//sets componenets from left to right
 		inCel.addActionListener(this);//allows for user input on text field
 		outFahr.setEditable(false);//cannot edit the Fahreneheit field
 		
 		//adding objects to program
 		add(heading);
 		add(inLabel);
 		add(outLabel);
 		add(inCel);
 		add(outFahr);
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows program to shut down
 	}
 	
 	public int convert(int C)//method for conversion calculation
 	{
 		return C*9/5 + 32;//conversion formula turns Celsius value into Fahrenheit
 	}
 	
 	public void actionPerformed(ActionEvent evt)//decides what happens when an event occurs
 	{
 		String userIn=inCel.getText();//sets input equal to Celsius value
 		celsTemp=Integer.parseInt(userIn);//turns input from String value to int value
 		
 		fahrTemp=convert(celsTemp);//converts Celsius to a Fahrenheit
 		
 		outFahr.setText(fahrTemp+" ");//displays output
 		repaint();//will not confuse user about which box to edit
 	}
 
 
 public static void main(String[] args)//main method
 {
 	RazaFahrConvert fahr=new RazaFahrConvert("C to F");//title for frame
 	fahr.setSize(200,150);//dimensions for frame
 	fahr.setVisible(true);//makes frame able to be viewed by user
 }
 
 }