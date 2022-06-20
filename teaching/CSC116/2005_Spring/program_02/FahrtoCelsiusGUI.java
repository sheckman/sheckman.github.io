import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Creates a GUI for converting
 * Fahrenheit to Celsius
 *
 * @author Carol Miller
 */
 
public class FahrtoCelsiusGUI extends JFrame implements ActionListener{

/**
 * Text field that handles input and output
 */
private JTextField         txtDegrees;

/**
 * Instance of the model class to use for converting
 */
private FahrtoCelsiusModel converter;

/**
 * Label for the text field
 */
private JLabel  lblEnter;

/**
 * Button to quit from program
 */
private JButton btnQuit;

/**
 * Button to convert to celsius
 */
private JButton btnFtoC;

/**
 * Panel holding the label and textfield
 */
private JPanel  pnlTop;

/**
 * Panel holding the two buttons
 */
private JPanel  pnlBottom;

/**
 * Constructor for GUI
 * Adds the components to the GUI and displays it
 *
 * @param model the instance of the model class to use
 */
public FahrtoCelsiusGUI (FahrtoCelsiusModel model) {
        super("Fahrenheit to Celsius Converter");
        converter = model;

	setSize (300,125);
	setLocation (100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 

        btnFtoC = new JButton("Convert"); 
        btnFtoC.setBackground(Color.white);

        btnQuit = new JButton ("Quit");
        btnQuit.setBackground(Color.red);

	lblEnter = new JLabel ("Enter degrees:");
        txtDegrees = new JTextField ("",13);
	
	Container c = getContentPane();
	c.setLayout (new GridLayout( 2, 1 )); // 2 rows, 1 column

        pnlTop = new JPanel();

        pnlTop.add (lblEnter);
        pnlTop.add (txtDegrees);

	pnlBottom = new JPanel();

        pnlBottom.add(btnFtoC); 
        pnlBottom.add(btnQuit);


	btnFtoC.addActionListener(this);			
        btnQuit.addActionListener(this);


        c.add (pnlTop);
        c.add (pnlBottom);

	setVisible(true);

}

/**
 * Listens for buttons being clicked
 *
 * @param e the event that occured
 */
public void actionPerformed (ActionEvent e) {

        if (e.getSource() == btnQuit) {
               System.exit(1);
        }

	String s       = txtDegrees.getText();

	converter.FtoC(s);
     
        String    degrees;
        degrees = converter.getAnswer();
		
	txtDegrees.setText (degrees);

}

/**
 * Creates an object of the GUI 
 *
 * @param args command line arguments (not used)
 */
public static void main (String [] args) {
        FahrtoCelsiusModel model = new FahrtoCelsiusModel();
	FahrtoCelsiusGUI gui = new FahrtoCelsiusGUI( model);
}
}