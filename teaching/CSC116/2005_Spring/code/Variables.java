/**
 * CSC116 Example Class to demonstrate variables
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Variables {

  /**
   * Instance variable named firstName
   */
  private String firstName;
 
  /**
   * Instance variable named lastName
   */
  private String lastName;

  /**
   * Instance variable named height
   */
  private int height;

  /**
   * Constructor to initialize instance variables
   */
  public Variables() {
    firstName = "Sarah";
    lastName = "Smith";
    height = 64;
  }
  
  /**
   * Method that prints out the local and instance variables
   */
  public void run() {
    //Local variables
    String firstName = "John";
    String lastName = "Doe";
     
    //An example that prints out the local variables firstName
    //and lastName and the instance variable height
    System.out.println(firstName + " " + lastName + " is " + height + " inches tall.");
  
    //An example that prints out the instance variables
    System.out.println(this.firstName + " " + this.lastName + " is " + this.height + " inches tall.");
    
  }

  /**
   * Main method which runs the program
   * @param args Array of strings from the command line
   */
  public static void main(String [] args) {
     Variables v = new Variables();
     v.run();
  }
}
