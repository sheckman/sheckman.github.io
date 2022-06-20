/** 
 * CSC116 Class Example to demonstrate how to convert Strings
 * to integers and doubles
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Conversion {

  /**
   * Main method which runs the program
   * @param args Array of strings from the command line
   */
  public static void main(String [] args) {

    //String variables
    String intNumber = "123";
    String doubleNumber = "123.4456";
    String notANumber = "asdf";

    //Parse number to an integer
    int iNum = Integer.parseInt(intNumber);
    System.out.println("Converted Integer: " + iNum);

    //Parse number to a double
    double dNum = Double.parseDouble(doubleNumber);
    System.out.println("Converted Double: " + dNum);

    //Sum up the two numbers
    double sum = dNum + iNum;
    System.out.println("Sum = " + sum);
  
    //Throws a NumberFormatException when program is run
    int error = Integer.parseInt(notANumber);

  }
}
