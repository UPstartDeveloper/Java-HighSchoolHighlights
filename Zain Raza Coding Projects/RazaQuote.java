import java.awt.*;//Applications Windows Toolkit
import java.awt.event.*;//Event Driven programming package
import javax.swing.*;//swing package

/*
 *Author name: Zain Raza
 *Description: Quote of the Day program.
 *Due Date: Thursday January 25, 2018
 */
 
 public class RazaQuote extends JFrame implements ActionListener//class declaration
 {
 	//variables
 	String comedyQuote = "Do not take life too seriously. You will never get out of it alive.";
 	String philosophyQuote="All that I know is that I know nothing.";
 	String miscellQuote="It's better to be a lion for a day than to be a sheep all your life.";;//Strings store comedy, philosophy, and miscellaneous quotes
 	JRadioButton comedy, philosophy, miscell;//Radio buttons store options
 	ButtonGroup quoteGroup;//allows only one answer
 	JPanel choice, resultPanel;//all options go together
 	Box quoteBox;
 	JTextField resultText;
 	JLabel resultLabl;
 	
 	//constructor
 	public RazaQuote()
 	{
 		setTitle("Quote of the Day");//title of frame
 		
 		setLayout(new GridLayout(0,2,5,5));
 		
 		//initialization of radio buttons
 		comedy=new JRadioButton("Comedy", true);
 		philosophy=new JRadioButton("Philosophy", false);
 		miscell=new JRadioButton("Miscellaneous", false);
 		//adding buttons to program
 		add(comedy);
 		add(philosophy);
 		add(miscell);
 	
 		quoteGroup=new ButtonGroup();//initialization of Group
 		//adding buttons to ButtonGroup
 		quoteGroup.add(comedy);
 		quoteGroup.add(philosophy);
 		quoteGroup.add(miscell);
 		
 		quoteBox = new Box( BoxLayout.Y_AXIS );
    	quoteBox.add(new JLabel(""));
    	quoteBox.add(Box.createRigidArea( new Dimension(1, 8)));
    	quoteBox.add(comedy);  
    	quoteBox.add(philosophy);
    	quoteBox.add(miscell);
    	
 		
 		choice=new JPanel();//initialization of panel
 		choice.add(new JLabel("Choose a Motivational Quote to Start Your Day!"));//adding JLabel specific to JPanel
 		//adding panels to button panel
 		choice.add(comedy);
 		choice.add(philosophy);
 		choice.add(miscell);
 		 
 		 // result panel
    	resultText  = new JTextField(7);
    	resultText.setEditable( false );   
    	resultLabl  = new JLabel("Motivation Destination");
    	resultPanel = new JPanel();
    	resultPanel.add(resultLabl);
    	resultPanel.add(resultText);
 		
 		//adding ActionListeners to JRadioButtons
 		comedy.addActionListener(this);
 		philosophy.addActionListener(this);
 		miscell.addActionListener(this);
 			
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows user to close the frame
 		add(choice);//adds panel to frame
 		add(quoteBox);//adds box to frame
 	}
 	
 	public void actionPerformed(ActionEvent evt)//method decides application response to events
 	{	
 		Object source = evt.getSource();//instaniates Object object instead setActionCommand()
 		
 		if(source==comedy)//user selects comedy quote
 		{
			resultLabl.setText(comedyQuote); 			
 		}
 		else if(source==philosophy)//user selects philosophy quote
 		{
 			esultLabl.setText(lhilosophyQuote);
 		}
 		else if(source==miscell)//user selects miscellaneoud quote
 		{
 			esultLabl.setText(miscellQuote);	
 		}	
 	}
 	//main method
 	public static void main(String [] args)
 	{
 		RazaQuote Motivation = new RazaQuote();//frame created
 		Motivation.setSize(500, 225);//dimensions of frame
 		Motivation.setResizable(true);
 		Motivation.setVisible(true);//makes frame visible
 	}
 }
 