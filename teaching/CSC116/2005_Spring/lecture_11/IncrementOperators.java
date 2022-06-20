/**
 * CSC116 Example Class Demonstrating Increment Operators
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 */
public class IncrementOperators {

  /**
   * Starts the program
   * @param args array of command line input strings
   */
  public static void main(String [] args) {

    int i = 1;
    int j = 0;

    j = i++;
    System.out.println("i = " + i + " j = " + j);

    i = 1;
    j = 0;
 
    j = ++i;
    System.out.println("i = " + i + " j = " + j);

    i = 3;
    j = 2;
    i += j;
    System.out.println("i = " + i + " j = " + j);
   
    i = 3;
    j = 2;
    i =+ j;
    System.out.println("i = " + i + " j = " + j);
  }
}
