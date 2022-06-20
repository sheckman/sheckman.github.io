import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * CSC116 Example Class Hello World
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class PhonePad extends JFrame {
  /**
   * Text area for display of the output
   */
  private JTextArea display; 

  /**
   * Array of buttons to allow the user to input information in the text area
   */
  private JButton[] buttonList; 

  /**
   * List of colors for the user to select from
   */
  private JComboBox colorList; 

  /**
   * String where the data to be shown on the display is stored
   */
  private String theList=""; 

  /**
   * Null constructor to initialize the GUI display
   */
  public PhonePad () {
    //The constructor is where the GUI is initialized

    //Set the size of the window
    final int DEFAULT_FRAME_WIDTH = 350;
    final int DEFAULT_FRAME_HEIGHT = 375;
    setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
    setLocation(50,50);

    //Set the windows title
    setTitle("PhonePad Test Window");

    //Now change the default operation of closing the window to exit for us
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //Obtain a reference to the content pane
    Container contentPane = getContentPane();

    //Construct the component -- text area
    display = new JTextArea(10,40); //Text area
    display.setEditable(false); //Don't allow editing

    //Construct the component -- color list
    colorList = new JComboBox();
    colorList.addItem("White");
    colorList.addItem("Red");
    colorList.addItem("Blue");
    colorList.addItem("Green");
    colorList.addActionListener(new ButtonListener()); //Add Listener

    //Create a JPanel for the color information with a label
    JPanel colorPanel = new JPanel();
    colorPanel.add(new JLabel("Background color: "));
    colorPanel.add(colorList);

    //Construct the component -- the button pad
    buttonList=new JButton[11]; //Button array
    for (int x=0; x<10; x++) {
      buttonList[x]=new JButton(Integer.toString(x)); //Buttons
      buttonList[x].addActionListener(new ButtonListener()); //Add Listener
      buttonList[x].addMouseListener(new MouseHoverListener()); //Add Listener
    }
    buttonList[10]=new JButton("Clear");
    buttonList[10].addActionListener(new ButtonListener()); //Add Listener


    //Create a JPanel for the buttons with a grid layout
    JPanel numberPanel = new JPanel();
    numberPanel.setLayout(new GridLayout(4,3));

    //Add the buttons to the numberPanel
    for (int x=0; x<11; x++)
      numberPanel.add(buttonList[x]);

    //Add the numberPanel and text area to the contentPane
    contentPane.add(colorPanel,"North");
    contentPane.add(display,"Center");
    contentPane.add(numberPanel,"South");

    //Pack the window to ensure proper display
    this.pack();
  }
  
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    //Create a sample of the PhonePad
    PhonePad test = new PhonePad();
    test.show();
  }

  /**
   * Inner class which will compile to PhonePad$ButtonListener.class
   * which implements an ActionListener called ButtonListener
   * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
   * @version 1.0
   */
  private class ButtonListener implements ActionListener {
    /**
     * The required actionPerformed method which must exist
     * in every ActionListener. 
     * @param event the event which triggered the running of the method
     */
    public void actionPerformed (ActionEvent event)
    {
      //Get what caused the event
      Object source = event.getSource();

      //Handle the event

      //Check the color
      String colorChoice = (String)colorList.getSelectedItem();

      if(colorChoice.equals("White"))
        display.setBackground(Color.white);
      else if (colorChoice.equals("Blue"))
        display.setBackground(Color.blue);
      else if (colorChoice.equals("Red"))
        display.setBackground(Color.red);
      else if (colorChoice.equals("Green"))
        display.setBackground(Color.green);

      //Number pressed
      if (source==buttonList[0])
        theList=theList+"0";
      else if (source==buttonList[1])
        theList=theList+"1";
      else if (source==buttonList[2])
        theList=theList+"2";
      else if (source==buttonList[3])
        theList=theList+"3";
      else if (source==buttonList[4])
        theList=theList+"4";
      else if (source==buttonList[5])
        theList=theList+"5";
      else if (source==buttonList[6])
        theList=theList+"6";
      else if (source==buttonList[7])
        theList=theList+"7";
      else if (source==buttonList[8])
        theList=theList+"8";
      else if (source==buttonList[9])
        theList=theList+"9";
      else if (source==buttonList[10])
        theList="";

      display.setText(theList);
      display.repaint();
    }
  }

  public class MouseHoverListener implements MouseListener {

    public void mouseClicked(MouseEvent e) {
	if(e.getSource() == buttonList[1]) {
		System.out.println("Mouse Clicked");
	}

    }

    public void mouseEntered(MouseEvent e) {

	if(e.getSource() == buttonList[0]) {
		buttonList[0].setEnabled(false);
	}

    }

    public void mouseExited(MouseEvent e) {
	if(e.getSource() == buttonList[0]) {
		buttonList[0].setEnabled(true);
	}

    }

    public void mousePressed(MouseEvent e) {
	if(e.getSource() == buttonList[1]) {
		System.out.println("Mouse Pressed");
	}

    }

    public void mouseReleased(MouseEvent e) {
	if(e.getSource() == buttonList[1]) {
		System.out.println("Mouse Released");
	}

    }
  }

  
}
