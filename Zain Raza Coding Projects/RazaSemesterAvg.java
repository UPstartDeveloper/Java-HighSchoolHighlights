import java.awt.*;//Application Windows Toolkit
import java.awt.event.*;//Event programming package
import javax.swing.*;//Swing package

/*
 *Author Name: Zain Raza
 *Description: GUI takes three grades and displays average.
 *Due Date: Wednesday December 13, 2017
 */
 
 public class RazaSemesterAvg extends JFrame implements ActionListener//class declaration
 {
 	double g1, g2, g3, a;//values hold the three grades
 	JLabel prompt1, prompt2, prompt3, average;//titles over boxes
 	JTextField grade1, grade2, grade3, avg;//text boxes for inputs and output
 	JButton avgButton;//when button is pressed, average is calculated
 	String last;//value stores average as a String
 	
 		//constructor
 	public RazaSemesterAvg(String title)
 	{
 		super(title);//initialization
 		
 		//text for labels
 		prompt1=new JLabel("Enter the First Grade:");
 		prompt2=new JLabel("Enter the Second Grade:");
 		prompt3=new JLabel("Enter the Third Grade:");
 		
 			setLayout(new GridLayout(3,3,20,10));//Grid set
 		
 		avgButton=new JButton("Average");//text displayed on button
 		
 			//text box allows for a 5-character limit on String
 		grade1=new JTextField(5);
 		grade2=new JTextField(5);
 		grade3=new JTextField(5);
 	
 		avg=new JTextField(5);//text box allows for a 5-character limt on output
 		avg.setEditable(false);//average box is not accessible to user
 		
 			//adding objects to program
 		add(prompt1);
 		add(prompt2);
 		add(prompt3);
 		add(grade1);
 		add(grade2);
 		add(grade3);
 		add(avg);
 		add(avgButton);
 		
 		avgButton.addActionListener(this);//enables response to button click
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets frame to close when X-ed out
 	}
 	
 	public double calculate()//calculates average value 
 	{
 		a=(g1+g2+g3)/3;//uses three grade values
 		return a;//average comes out of the method
 	}
 	
 	public void actionPerformed(ActionEvent evt)//decides what happens as events occur
 	{
 			//pulls String value from input stream for all 3 grade values
 		String userIn1=grade1.getText();
 		String userIn2=grade2.getText();
 		String userIn3=grade3.getText();
 	
 			
 			//converting Strings to doubles
 		g1=Double.parseDouble(userIn1);
 		g2=Double.parseDouble(userIn2);
 		g3=Double.parseDouble(userIn3);
 		
 		calculate();//average value is computed
 		last=Double.toString(a);//turns avg into a String
 		avg.setText(last);//the average value goes into the average textbox
 		
 		repaint();//paints output a different color so as to not confuse user
 		
 	}
 	
 	public static void main(String[] args)//main method
 	{
 		RazaSemesterAvg CompSci=new RazaSemesterAvg("Semester Grade Average");//title for frame
 		CompSci.setSize(450,400);//dimensions set for the frame
 		CompSci.setVisible(true);//user will be able to see GUI
 	}
 }