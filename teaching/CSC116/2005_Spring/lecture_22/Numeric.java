/**
 * CSC116 Example Class Numeric to Demonstrate Using Static Methods
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class Numeric {
  /**
   * Static method to determine if two doubles are approximately equal.
   * @param x first of the two numbers to compare
   * @param y second of the two numbers to compare
   * @return the value true if they are close to equal
   */
  public static boolean approxEqual (double x, double y) {
    final double EPSILON = 1E-14;
    double xymax = Math.max(Math.abs(x),Math.abs(y));
    return Math.abs(x-y) <= EPSILON * xymax;
  }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    double x=1.0;
    double y=x;

    if (Numeric.approxEqual(x,y))
      System.out.println(x+" and "+y+" are approximately equal.");
    else
      System.out.println(x+" and "+y+" are not approximately equal.");
    
    y+=1E-14;
    if (Numeric.approxEqual(x,y))
      System.out.println(x+" and "+y+" are approximately equal.");
    else
      System.out.println(x+" and "+y+" are not approximately equal.");

    y+=1E-14;
    if (Numeric.approxEqual(x,y))
      System.out.println(x+" and "+y+" are approximately equal.");
    else
      System.out.println(x+" and "+y+" are not approximately equal.");
  }
}
