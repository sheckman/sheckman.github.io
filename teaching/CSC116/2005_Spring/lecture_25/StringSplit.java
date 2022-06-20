/**
 * CSC116 Example Class StringSplit which demonstrates the String split method
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class StringSplit {
  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    String input = "This is an example.";
    String[] output=input.split("\\s");
    System.out.println("The input is: "+input);
    System.out.println("The output is: ");
    for (int i=0; i < output.length; i++) 
      System.out.println(" "+output[i]);
  }
}
