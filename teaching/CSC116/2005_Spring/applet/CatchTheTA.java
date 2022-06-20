import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Sets up the infomation for the Japplet.
 */
public class CatchTheTA extends JApplet {
    /**
     *  A number used with the timer. each 100 is .1 second
     *              200  ---  .2 seconds
     *              500  ---  .5 seconds
     */
    private final int DELAY = 100;
    /**
     * the timer class that causes the action to happen.
     */
    private Timer timer;

    /**
     * Initializes the applet. Creates the layout, creates a timer to
     * use in updating the animation panel.
     */
    public void init() {

        timer = new Timer(DELAY, null);// Create a timer object using .1 second interval

        JLabel totalHitLabel = new JLabel("Total Hits :");// creates a label
        JTextField totalHits = new JTextField("0", 20); // creates a textfield
        JPanel tallyPanel = new JPanel();// creates the panel that will be displayed on the applet

        tallyPanel.add(totalHitLabel, BorderLayout.CENTER);//adds the label to a panel
        tallyPanel.add(totalHits, BorderLayout.EAST);// adds the textfield to the panel

        getContentPane().add(new AnimationPanel(timer, totalHits), BorderLayout.CENTER); 
                                    // creates the AnimationPanel and then adds to the applet 


        getContentPane().add(tallyPanel, BorderLayout.SOUTH); // adds the panel to the applet

    }
    /**
     * method to start the timer
     */
    public void start() {
        timer.start();
    }
    /**
     * method to stop the timer
     */
    public void stop() {
        timer.stop();
    }

}
