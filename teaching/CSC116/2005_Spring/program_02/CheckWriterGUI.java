import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * CheckWriterGUI class is the view to the check writer class
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version $Id: CheckWriterGUI.java,v 1.1 2004/09/17 18:32:42 jason Exp $
 */
public class CheckWriterGUI extends JFrame implements ActionListener {

  /**
   * Model for the GUI
   */
   private CheckWriterModel theModel;

  /**
   * JButton to let the stuff go
   */
   private JButton goButton;

  /**
   * JTextArea to get the input from the user
   */
  private JTextArea inputArea;

  /**
   * JTextArea to show the output to the user
   */
  private JTextArea outputArea;

  /**
   * Default constructor to setup the window
   * @since 1.0
   */
  public CheckWriterGUI() {
    //For the application setup the window
    if (this instanceof JFrame) {
      setSize(500,200);
      setLocation(40,40);
      setTitle("Check Writer");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Initialize instance variables
    theModel = new CheckWriterModel();
    goButton = new JButton("Go");
    goButton.addActionListener(this);
    inputArea = new JTextArea(1,10);
    outputArea = new JTextArea(3,40);
    outputArea.setEditable(false);
    outputArea.setLineWrap(true);
    outputArea.setWrapStyleWord(true);

    //Setup top panel
    JPanel topPanel = new JPanel();
    JLabel numLabel = new JLabel("Number to translate: ");
    topPanel.add(numLabel);
    topPanel.add(inputArea);     

    //Setup center panel
    JPanel centerPanel = new JPanel();
    JLabel outLabel = new JLabel("Number as text: ");
    centerPanel.add(outLabel);
    centerPanel.add(outputArea);
   
    this.getContentPane().add(topPanel,BorderLayout.NORTH);
    this.getContentPane().add(centerPanel,BorderLayout.CENTER);
    this.getContentPane().add(goButton,BorderLayout.SOUTH);
  }

  public void actionPerformed (ActionEvent e) {
    try {
      String inText = inputArea.getText();
      double inValue = Double.parseDouble(inText);
      theModel.setCheckAmount(inValue);
      outputArea.setText(theModel.getCheckWords());
    } 
    catch (NumberFormatException except) {
      outputArea.setText("You have input a non-numeric value");
      inputArea.setText("");
    }
  }

  /**
   * Main method to get stuff started
   * @since 1.0
   */ 
  public static void main (String args[]) {
    CheckWriterGUI myGUI = new CheckWriterGUI();
    myGUI.show();
  }
}
