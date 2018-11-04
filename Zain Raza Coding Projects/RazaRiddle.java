import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//packages needed for GUI

public class RazaRiddle extends JFrame implements ActionListener//class declaration
{
	//objects
	JLabel question;
	JButton button;
	JLabel answer;
	JLabel picture;
	
	public RazaRiddle(String title)//constructor
	{
		//initialization of variables
		super(title);
		question=new JLabel("What is light as a feather, yet even the strongest man cannot hold it for more than a few minutes?");
		button=new JButton("Click Here for Answer");
		answer=new JLabel("Breath");
		picture=new JLabel();
		
		setLayout(new GridLayout(2,2,10,25));//Grid set
		
		button.setActionCommand("button");//enables user response
		
		button.addActionListener(this);//enables program to respond to user
		
		question.setForeground(Color.blue);//colors set
		question.setAlignmentX(JButton.CENTER_ALIGNMENT);//columns set
		
		//properties for phot
		ImageIcon size=new ImageIcon(new ImageIcon("breath.png").getImage().getScaledInstance(1, 1, Image.SCALE_DEFAULT));
		picture.setIcon(size);
		picture.setAlignmentX(JButton.CENTER_ALIGNMENT);
		
		getContentPane().setBackground(Color.green);
		
		answer.setForeground(Color.blue);
		answer.setAlignmentX(JButton.CENTER_ALIGNMENT);
		
		//adding objects
		add(question);
		add(answer);
		add(button);
		add(picture);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getActionCommand().equals("button"))
		{
			answer.setForeground(Color.green);
			
			ImageIcon size=new ImageIcon(new ImageIcon("breath.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
			picture.setIcon(size);
		}
	}
	public static void main(String[] args)
	{
		RazaRiddle Riddle=new RazaRiddle("The One Question to Rule Them All");
		Riddle.setSize(1150, 500);
		Riddle.setVisible(true);
	}
}