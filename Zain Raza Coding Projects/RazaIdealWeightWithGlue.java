import java.awt.*;//Applications Windows Toolkit package
import java.awt.event.*;//package allows for event driven programming
import javax.swing.*;//swing package

/*
 *Author name: Zain Raza
 *Description: Exercise 2: Ideal Weight with Glue
 *Due Date: Monday, January 22, 2018
 */
 
  public class RazaIdealWeightWithGlue extends JFrame implements ActionListener//class declaration
 {
 	double height, weightm, weightf;//varibble for weight and height of both sexes
 	JRadioButton male, female;//multiple choice for user's sex
 	ButtonGroup genderGroup;//grouping for male and female
 	Box genderBox;//area dedicated to genderGroup
 	
    JRadioButton heightA, heightB, heightC, heightD, heightE;
    ButtonGroup heightGroup;
    Box heightBox;
  
    Box buttonBox;
  
    JTextField resultText;
    JLabel resultLabl;
    JPanel resultPanel;
    
    //constructor
  public RazaIdealWeightWithGlue()  
  { 
    setTitle("Your Ideal Weight");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    // gender group
    male = new JRadioButton("Male", true);
    female = new JRadioButton("Female", false);
    genderGroup = new ButtonGroup();
    genderGroup.add(male);  
    genderGroup.add(female);
    
    genderBox = new Box( BoxLayout.Y_AXIS );
    genderBox.add(new JLabel("Your Gender"));
    genderBox.add(Box.createRigidArea( new Dimension(1, 8)));
    genderBox.add(male);  
    genderBox.add(female);
    genderBox.add( Box.createRigidArea( new Dimension(1, 73)));
   
    // height group
    heightA = new JRadioButton("60 to 64 inches", true );
    heightB = new JRadioButton("64 to 68 inches", false);
    heightC = new JRadioButton("68 to 72 inches", false);
    heightD = new JRadioButton("72 to 76 inches", false);
    heightE = new JRadioButton("76 to 80 inches", false);
  
    heightGroup = new ButtonGroup();
    heightGroup.add(heightA); heightGroup.add(heightB);
    heightGroup.add(heightC); heightGroup.add(heightD);
    heightGroup.add(heightE);
  
    heightBox = new Box(BoxLayout.Y_AXIS);   
    heightBox.add(new JLabel("Your Height"));
    heightBox.add(Box.createRigidArea(new Dimension(1, 8)));
    heightBox.add(heightA); heightBox.add(heightB);
    heightBox.add(heightC); heightBox.add(heightD);
    heightBox.add(heightE);

    // button Box
    buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(genderBox);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(heightBox);
    buttonBox.add(Box.createHorizontalGlue());
       
    // result panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );   
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add(resultLabl);
    resultPanel.add(resultText);
    
    // Frame
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    add(buttonBox);
    add(resultPanel);
    
    //setting ActionCommands and adding ActionListeners to all buttons
    
    male.setActionCommand("Male");
    male.addActionListener(this);
    
    female.setActionCommand("Female");
    female.addActionListener(this);
    	
    heightA.setActionCommand("60 to 64 inches");
    heightA.addActionListener(this); 
    	
    heightB.setActionCommand("64 to 68 inches");
    heightB.addActionListener(this);
    	
    heightC.setActionCommand("68 to 72 inches");
    heightC.addActionListener(this);
    	
    heightD.setActionCommand("72 to 76 inches");
    heightD.addActionListener(this);
    
    heightE.setActionCommand("76 to 80 inches");
    heightE.addActionListener(this);
  }
  
  public double calculateMale()//calculates ideal weight for men
  {
  	weightm=(height*height)/28;//formula for ideal weight in men
  	return weightm;
  }
  
   public double calculateFemale()//calculates ideal weight for men
  {
  	weightf=(height*height)/30;//formula for ideal weight in women
  	return weightf;
  }
  	public void actionPerformed(ActionEvent evt) //the action performed method
  	{
  		if (evt.getActionCommand().equals("Male")&&evt.getActionCommand().equals("60 to 64 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=62.0;//height set in the middle of range
  			resultText.setText(calculateMale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Male")&&evt.getActionCommand().equals("64 to 68 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=66.0;//height set in the middle of range
  			resultText.setText(calculateMale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Male")&&evt.getActionCommand().equals("68 to 72 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=70.0;//height set in the middle of range
  			resultText.setText(calculateMale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Male")&&evt.getActionCommand().equals("72 to 76 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=74.0;//height set in the middle of range
  			resultText.setText(calculateMale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Male")&&evt.getActionCommand().equals("76 to 80 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=78.0;//height set in the middle of range
  			resultText.setText(calculateMale() + " lbs.");//result text is outputted
  		}
  		else if (evt.getActionCommand().equals("Female")&&evt.getActionCommand().equals("60 to 64 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=62.0;//height set in the middle of range
  			resultText.setText(calculateFemale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Female")&&evt.getActionCommand().equals("64 to 68 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=66.0;//height set in the middle of range
  			resultText.setText(calculateFemale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Female")&&evt.getActionCommand().equals("68 to 72 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=70.0;//height set in the middle of range
  			resultText.setText(calculateFemale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Female")&&evt.getActionCommand().equals("72 to 76 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=74.0;//height set in the middle of range
  			resultText.setText(calculateFemale() + " lbs.");//result text is outputted
  		}
  		else if(evt.getActionCommand().equals("Female")&&evt.getActionCommand().equals("76 to 80 inches")) //this method will be uses the calculate method to find the total
  		{
  			height=78.0;//height set in the middle of range
  			resultText.setText(calculateFemale() + " lbs.");//result text is outputted
  		}	
  	}
  //main method
  public static void main (String[] args)
  {
    RazaIdealWeightWithGlue weightApp  = new RazaIdealWeightWithGlue() ;
    weightApp.setSize(250, 225);   
    weightApp.setResizable(false); 
    weightApp.setVisible(true);        
  }
 }