import java.io.*;

/**
 * CSC116 Example Class NumberDemo to Demonstrate Catching Multiple 
Exceptions
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class NumberDemo {
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new 
InputStreamReader(System.in));
      System.out.println("How old are you?");
      String inputLine = in.readLine(); 
      int age = Integer.parseInt(inputLine);
      age++;
      System.out.println("Next year you will be " + age);
    }
    catch (IOException e) {
      System.out.println("Input/output error " + e);
    }
    catch (NumberFormatException e) {
      System.out.println("Input was not a number");
    }
  }
}
