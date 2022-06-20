/**
 * CSC116 Example Class CommandLine to Demonstrate Command Line Arguments
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class CommandLine {
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main (String[] args) {
    for (int i=0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
