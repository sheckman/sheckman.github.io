import java.lang.Math;

/**
 * CSC116 Example Class to demonstrate casting versus rounding
 * @author Sarah E. Smith
 * @version 1.0
 */
public class Rounding {

  /** 
   * Main method which runs the program
   * @param args array of strings from the command line
   */
  public static void main(String [] args) {

    
    double x = 10.6;
    
    //Example of casting
    int xCast = (int)x;              //xCast = 10

    //Example of rounding
    long xRound = Math.round(x);     //xRound = 11;

    System.out.println("X cast to an int = " + xCast);
    System.out.println("X rounded to a long = " + xRound);

  }

}
