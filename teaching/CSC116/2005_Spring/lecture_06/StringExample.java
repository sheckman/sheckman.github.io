/**
 * CSC116 Example Class to Demonstrate Strings
 * @author Sarah E. Smith
 * @version 1.0
 */
public class StringExample {

  /**
   * Main method which runs the program
   * @param args Array of Strings from the command line
   */
  public static void main(String [] args) {

    //String variables
    String name = "Sarah";
    String favColor = "Blue";
    String leastFavColor = "Yellow";

    //Get the lengths of the strings
    //Example of number concatentated to Strings
    System.out.println("The length of " + name + " is " + name.length());
    System.out.println("The length of " + favColor + " is " + favColor.length());
    System.out.println("The length of " + leastFavColor + " is " + leastFavColor.length());
    System.out.println("");

    //Substrings - remember that the index of Strings start with 0!
    System.out.println("The third letter of " + name + " is " + name.substring(2,3));
    System.out.println("Everything except the first letter of " + favColor + " is " + favColor.substring(1));
    System.out.println("Everything except the first three letters of " + leastFavColor + " is " + leastFavColor.substring(3));
    System.out.println("");

    //Case Conversion
    System.out.println(name + " in all lowercase is " + name.toLowerCase());
    System.out.println(favColor + " in all uppercase is " + favColor.toUpperCase());
    System.out.println("");
  
    //Concatenation
    String str = name + " likes the color " + favColor + " but does not like the color " + leastFavColor;
    System.out.println(str);
    System.out.println("");
  }

}
