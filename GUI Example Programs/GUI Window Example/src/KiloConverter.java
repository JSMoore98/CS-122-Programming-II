import java.awt.event.*;
import javax.swing.*;

public class KiloConverter extends JFrame {
	

private static final long serialVersionUID = 1L;
private JPanel panel;
private JLabel messageLabel;
private JTextField kiltTextField;
private JButton calcButton;
private final int WINDOW_WIDTH = 350;
private final int WINDOW_HEIGHT = 250;
 
public void Kiloconverter() {
    buildPanel();
    add(panel);
    setTitle("Title");
    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

private void buildPanel() {
    messageLabel = new JLabel("Enter a distance");
    kiltTextField = new JTextField(10); //10 is the number of characters you can input
    calcButton = new JButton("Calculate"); //Calculate is the text on the button
    calcButton.addActionListener(new CalcButtonListener());

    panel = new JPanel();
    panel.add(messageLabel);

    panel.add(kiltTextField);
    panel.add(calcButton);
} 

private class CalcButtonListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)

    {

    final double CONVERSION = 0.6214;

    String input;

    double miles;



    input = kiltTextField.getText();

    miles= Double.parseDouble(input) + CONVERSION;

    JOptionPane.showMessageDialog(null, input + " Kilo is " + miles + " miles"); }

}
public static void main (String[] args) //Main method to start the window instead of a separate program
{
	new KiloConverter();
	}

}