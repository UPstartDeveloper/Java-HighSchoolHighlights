import java.awt.*;//Application Windows Toolkit
import javax.swing.*;//Swing package for GUI
import java.awt.event.*;//Allow for event programming
import java.text.NumberFormat;//import NumberFormat package

/*
 *Author name: Zain Raza
 *Due Date: Tuesday December 19, 2017
 *Description: Applications takes in caloric data and fat amount for a food, then lets user know if it is healthy.
 */
 
 public class RazaCaloriesFat extends JFrame implements ActionListener//class declaration
 {
 	double gram, totalCal, perCal;//values that store inputs and output
 	JLabel top, input1, input2, output;//text lines on program
 	JButton calculate, clear;//button objects on program
 	JTextField fat, calories, percent;//text fields where inputs and output are displayed
 		String userIn1, userIn2, userOut;//String values correspond to double values
 	
 	public RazaCaloriesFat(String title)//constructor
 	{
 		//initialization of variables
 		super(title);
 		NumberFormat decimal=NumberFormat.getNumberInstance();//formats decimals
 		NumberFormat perFormat=NumberFormat.getPercentInstance();//formats percents
 		top=new JLabel("Percent or Calories from Fat");//title of window
 		input1=new JLabel("Enter grams of fat:");//label next to first input box
 		input2=new JLabel("Enter total calories:");//label next to second input box	
 		output=new JLabel("Percent calories from fat:");//label next to output box	
 		calculate=new JButton("Calculate");//text on first button
 		clear=new JButton("Clear All");//text on scond button
 		
 		fat=new JTextField(7);//first text box allows 7-character input
 		calories=new JTextField(7);//second text box allows 7-character input
 		percent=new JTextField(7);//third text box display 7-character output
 		percent.setEditable(false);//disallows user inputs to output box
 		
 			//adding objects to program
 		add(top);
 		add(input1);
 		add(input2);
 		add(output);
 		add(calculate);
 		add(clear);
 		add(fat);
 		add(calories);
 		add(percent);
 		
 			//adding ActionListener to objects
 		fat.addActionListener(this);	
 		calories.addActionListener(this);
 		calculate.addActionListener(this);
 		clear.addActionListener(this);
 			
 		setBackground(Color.yellow);//sets inital color of frame
 		setLayout(new FlowLayout());//sets components from left to right
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows program to halt
 	}
 	
 	public double newPercent()//calcuates percent of fat calories
 	{
 		perCal=((gram*9)/totalCal)*100;//formula for value
 		
 		return perCal;//return statement
 	}
 	
 	public void colorChange()//controls change of frame color
 	{
 		if(perCal>30)//if the percent of fat calories exceeds 30%
 		{
 			setBackground(Color.red);//frames goes to red color
 		}
 		else//if the value is below or equal to 30%
 		{
 			setBackground(Color.green);//frame is set to green color
 		}
 	}
 	public void actionPerformed(ActionEvent evt)//decides event programming method
 	{
 		if(evt.getActionCommand().equals("Calculate"))//method for when user clicks Calculate button
 		{
 		//pulls String values from all three double values
 		userIn1=fat.getText();
 		userIn2=calories.getText();
 		userOut=percent.getText();
 	
 		//converting Strings to double values
 		gram=Double.parseDouble(userIn1);
 		totalCal=Double.parseDouble(userIn2);
 		perCal=Double.parseDouble(userOut);
 		
 		newPercent();//perCal is calculated
 	    userOut=Double.toString(perCal);//userOut is set equal to perCal
 		 //userOut=Double.toString(perCal);//userOut is set equal to perCal
 	
 	 /*userOut=(perFormat.format(perCal));
 	  */		
 		percent.setText(userOut);//String is put inside tex tbox

 		colorChange();//changes color of frame based on percentage
 		} 	
 		else if (evt.getActionCommand().equals("Clear All"))//when clear all is clicked
 		{ 
 			//all Strings in boxes go blank
 			userIn1="";
 				userIn2="";
 					userOut="";
 		}
 	}
 	
 	public static void main(String [] args)//main method
 	{
 		RazaCaloriesFat Diet=new RazaCaloriesFat("Check Your Fats!");//instantiation
 		Diet.setSize(400, 400);//dimensions of frame
 		Diet.setVisible(true);//sets frame visible
 	}
 }