import java.io.*;  //Imports the Java I/O package

/**
 * CSC116 Example Class to demonstrate reading input from standard input
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class ReadInput {

  /**
   * Main method which runs the program
   * @param args Array of strings from the command line
   */
  public static void main(String [] args) {

    //variables
    String name = "";
    int height = 0;

    //Code to read user input
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("What is your name? " );
  
    //Try and catch errors for IOException
    try {
      name = console.readLine();
    }
    catch (IOException e) {
      System.out.println(e);
      System.exit(1);
    }

    System.out.println("");
    System.out.println("What is your height (in inches)?");

    //Try and catch errors for both IOException and NumberFormatException
    try {
      String sHeight = console.readLine();
      height = Integer.parseInt(sHeight);
    }
    catch (IOException e) {
      System.out.println(e);
      System.exit(1);
    }
    catch (NumberFormatException e) {
      System.out.println(e);
      System.exit(1);
    }

    //Output results
    System.out.println("");
    System.out.println(name + " is " + height + " inches tall.");
  }

}
