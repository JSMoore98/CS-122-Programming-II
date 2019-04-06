import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * This GUI program simulates rolling two dice
 * @author Josiah
 *
 */
public class DiceRoller extends JFrame {
	
	//Creates component variables
	private JPanel dicePanel;
	private JPanel buttonPanel;
	private JPanel textPanel;
	private JLabel label;
	private JButton roll;
	private JLabel dice1;
	private JLabel dice2;
	private ImageIcon image1;
	private ImageIcon image2;
	
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 300;
	
	public DiceRoller() {
		//Sets frame details
		setTitle("Dice Roller");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Builds the panels
	    buildDicePanel();
	    buildButtonPanel();
	    buildTextPanel();

	    //Adds the panels and their layout
	    setLayout(new BorderLayout(5,5));
	    add(textPanel, BorderLayout.NORTH);
	    add(dicePanel, BorderLayout.CENTER);
	    add(buttonPanel, BorderLayout.SOUTH);
	    
		setVisible(true);
	}
	
	/**
	 * Builds the button panel
	 */
	private void buildButtonPanel() {
		//Creates the panel
		buttonPanel = new JPanel();
		
		//Creates the button and its attributes
		roll = new JButton("Roll");
		roll.addActionListener(new ButtonListener());
		roll.setMnemonic(KeyEvent.VK_R);
		roll.setToolTipText("Click here to roll the dice.");
		
		//Adds the button to the panel
		buttonPanel.add(roll);
		
	}
	
	/**
	 * Builds the text panel
	 */
	private void buildTextPanel() {
		//Creates the panel
		textPanel = new JPanel();
		
		//Creates the label
		label = new JLabel("Dice Results:");
		
		//Adds the label to the panel
		textPanel.add(label);
	}
	
	/**
	 * Builds the dice panel
	 */
	private void buildDicePanel() {
		//Creates the panel
		dicePanel = new JPanel();
		
		//Creates the two dice and their default image
		image1 = new ImageIcon("Die1.jpg");
		dice1 = new JLabel(); 
		dice1.setIcon(image1);
		
		image2 = new ImageIcon("Die1.jpg");
		dice2 = new JLabel(); 
		dice2.setIcon(image2);
		
		//Adds the dice to the panel
		dicePanel.setLayout(new GridLayout(1,2));
		dicePanel.add(dice1);
		dicePanel.add(dice2);
		
		//Centers the two dice
		dice1.setHorizontalAlignment(JLabel.CENTER);
		dice2.setHorizontalAlignment(JLabel.CENTER);
		
		//Adds the border to the panel
		dicePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}
	
	/**
	 * This class is the button listener for rolling the dice
	 * @author Josiah
	 *
	 */
	private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	        int die1,die2;
	        //Creates the random number generator
	        Random random = new Random();
	        
	        //Gets the two random numbers
	        die1 = random.nextInt(6)+1;
	        die2 = random.nextInt(6)+1;
	        
	        //Sets the new file path for the dice
	        image1 = new ImageIcon("Die" + die1 + ".jpg");
	        dice1.setIcon(image1);
	        image2 = new ImageIcon("Die" + die2 + ".jpg");
	        dice2.setIcon(image2);
	      }
	   }

	/**
	 * Calls the GUI class to be created
	 */
	public static void main(String[] args)
	   {
	      new DiceRoller();
	   }
}
