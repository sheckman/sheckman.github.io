import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
 /**
  * This class sets up the GUI that is displayed in the applet.
  * @version updated on 12-10-04 by JCO
  * 
  */
public class AnimationPanel extends JPanel implements ActionListener,
                                                      MouseListener {

    /**
     * This is the width of the applet.
     */
    private final int WIDTH = 300;
    /**
     * This is the height of the applet.
     */
    private final int HEIGHT = 300;
    /**
     * This is the width of the image. This final int is not set until the image is loaded in the constructor.
     */
    private final int IMAGE_WIDTH;
    /**
     * This is the height of the image. This final int is not set until the image is loaded in the constructor.
     */
    private final int IMAGE_HEIGHT;
    /**
     * This object is what handles the image of the TA.
     */
    private ImageIcon image;
    /**
     * This is the timer class that makes the picture move.
     */
    private Timer timer;
    /**
     * this is x of (x,y) point of the upper left corner of the picture.
     */
    private int x;
    /**
     * this is y of (x,y) point of the upper left corner of the picture.
     */
    private int y;
    /**
     * this is what the movement the picture starts with.
     */
    private int moveX;
    /**
     * this is what the movement the picture starts with.
     */
    private int moveY;
    /**
     * The textfield that displays the number of hits.
     */
    private JTextField tallyTextField;
    /**
     * The counter for the number of hits.
     */
    private int totalHits;

    /**
     * Creates a panel for the animation
     * 
     * DO NOT CHANGE THIS METHOD.
     *
     * @param countDown  timer interval (in milliseconds) for updating panel
     * @param tally      textfield to update when mouse clicked on image
     */
    public AnimationPanel (Timer countDown, JTextField tally) {

        timer = countDown;  // sets the local Timer to a instance variable
        tallyTextField = tally;   // sets the local Jtextfield to a instance variable
        totalHits = 0;   // sets the counter to 0
        timer.addActionListener(this);  // This causes the actionPerformed to run each time the timer runs down
        addMouseListener(this);
        ClassLoader cl = this.getClass().getClassLoader();  // this sets up the picture loader
        image = new ImageIcon(cl.getResource("TAFace.gif")); // this loads the picture

        IMAGE_WIDTH = image.getIconWidth(); // this sets the image width, this is a final and can be set only one time.
	IMAGE_HEIGHT = image.getIconHeight();// this sets the image height, this is a final and can be set only one time.

        x = 0; // starting postion of the upper left corner of the picture[ x of (x,y)]
        y = 40;// starting postion of the upper left corner of the picture[ y of (x,y)]

        moveX = 10; // the movement of the picture
        moveY = 10; // the movement of the picture

        setBackground(Color.red); //sets the background of the applet
        setPreferredSize(new Dimension(WIDTH, HEIGHT)); // sets the size 
        setLocation(100, 100); // sets the location

    }
    /**
     * Paint icon at (x,y) 
     * 
     * DO NOT CHANGE THIS METHOD
     * 
     * @param page  graphics object used for updates
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);

    }


    /**
     * Receives control when timer has counted down and updates (x,y) for painting next image.
     * This starts out moving in a stright line, It has condtion logic to keep it from going off the screen.
     * 
     * This method will have to be updated to make the picture move at random movements.
     *
     * @param event  event that caused action
     */
    public void actionPerformed(ActionEvent event) {

        x = x + moveX;
        y = y + moveY;

        if (x <= 0 || x >= WIDTH-IMAGE_WIDTH)
            moveX = -moveX ;
 
        if (y <=0 || y >= HEIGHT-IMAGE_HEIGHT)
            moveY = -moveY;

        repaint();

    }
    /**
     * Method not used
     */
    public void mouseMoved(MouseEvent e) {}
    /**
     * Method not used
     */
    public void mousePressed(MouseEvent e) {}
    /**
     * Method not used
     */
    public void mouseReleased(MouseEvent e) {}
    /**
     * Method not used
     */
    public void mouseEntered(MouseEvent e) {}
    /**
     * Method not used
     */
    public void mouseExited(MouseEvent e) {}

   /**
    * Receives control when left mouse button is clicked.
    * To start out, it displays the x,y on the terminal screen and updates the counter in the applet.
    * 
    * This method will have to be updated to do the following:
    * Determines if mouse click is inside image, if so
    * updates tally count in text field.
    *
    * @param e  mouse event
    **/
    public void mouseClicked(MouseEvent e) {

        System.out.println("mouse clicked at: " +
                           e.getX() + ", " + e.getY());
        totalHits++;
        tallyTextField.setText("" + totalHits);
    
    }

}
