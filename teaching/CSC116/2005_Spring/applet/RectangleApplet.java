import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * CSC116 Example Class RectangleApplet which Demonstrates an AWT Applet
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class RectangleApplet extends Applet {
 
  /**
   * The paint method which runs when the applet needs to be
   * drawn on the screen. 
   * @param g the Graphics display on which the applet is being drawn
   */
  public void paint (Graphics g) {

    //Convert Graphics object to Graphics2D object
    Graphics2D g2 = (Graphics2D) g;

    //Construct a rectangle
    Rectangle cerealBox = new Rectangle (5,10,20,30);

    //Draw cerealBox
    g2.draw(cerealBox); 

    //move cerealBox 15 units right and 25 units down
    cerealBox.translate(15,25);

    //Set the pen color to red
    g2.setColor(Color.red);

    //Draw cerealBox
    g2.draw(cerealBox); 
  }
}
