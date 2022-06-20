/**
 * CSC116 Example Class to demonstrate lack of accuracy in double addition
 * @author Sarah E. Smith
 * @version 1.0
 */
public class DoubleAddition {

   /**
    * Main method which runs the program
    * @param args array of strings from the command line
    */
   public static void main(String [] args) {
      //0.1 is added 10 times
      double total = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
      System.out.println("Total is " + total);  //total = .99

      //0.1 is multiplied by 10
      double val = 0.1;
      total = val * 10;
      System.out.println("New total is " + total);  //total is 10

   }
}
