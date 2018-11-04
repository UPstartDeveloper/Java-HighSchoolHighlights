import java.awt.*;//application Windows toolkit package
import javax.swing.*;//swing package needed for GUI
import java.awt.event.*;//required package for GUI
/*
 *Author name: Zain Raza
 *Description: RazaTranslation is an application which displays an word in both its English and Latin.
 *Due Date: Tuesday November 28, 2017
 */
 public class RazaTranslation extends JFrame implements ActionListener//class delcaration
 {
 	JButton English;//to-English Translator
 	JButton Latin;//to-Latin Translator
 	JLabel engWord;//displays default String
 	String eng="Sunflower";
 	String lat="Helianthus";
 	
 	public RazaTranslation(String title)//constructor
 	{
 		super(title);
 		JButton English=new JButton(eng);//label on English button
 		JButton Latin=new JButton(lat);//label on Latin button
 		engWord=new JLabel(eng);//String is to set to default in English
 		
 		setLayout(new FlowLayout());//sets layout from left to right and enables word wrap
 		
 		add(English);
 		add(Latin);
 		add(engWord);
 		
 		English.setActionCommand(eng);//what word will be on click
 		Latin.setActionCommand(lat);//word display
 		
 		English.addActionListener(this);//enables on click-response
 		Latin.addActionListener(this);//enables on-click response
 		
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame closes on exit
 	}
 	
 	public void actionPerformed(ActionEvent evt)//sets label word to English, or to Latin otherwise
 	{
 		if(evt.getActionCommand().equals(eng))//paramter is the default English String
 		{
 			engWord.setText(eng);//sets label text to English word
 		}
 		else 
 		{
 			engWord.setText(lat);//otherwise it becomes Latin
 		}
 	}
 	
 	public static void main(String[] args)//main method
 	{
 		RazaTranslation Translator=new RazaTranslation("Translator");//instantiates window
 		Translator.setSize(275, 200);//dimensions of window set
 		Translator.setVisible(true);//user can see window
 	}	
 }