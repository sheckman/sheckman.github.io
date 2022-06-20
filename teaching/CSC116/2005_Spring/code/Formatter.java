import java.text.NumberFormat;

/**
 * CSC 116 Example Class to Demonstrate the NumberFormat class
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Formatter {

  /**
   * Main method which runs the program
   * @param args Array of Strings from the command line
   */
  public static void main(String [] args) {
    
    //Create 2 NumberFormat objects - one which uses the Currency Instance
    NumberFormat nf = NumberFormat.getNumberInstance();
    NumberFormat cnf = NumberFormat.getCurrencyInstance();

    //Set up the number formmate (number instance) with display 
    //information
    nf.setMinimumFractionDigits(3);
    nf.setMaximumFractionDigits(3);
  
    //Output the value using each formatter
    double money = 1.35573456;
    System.out.println("The output from nf is " + nf.format(money));
    System.out.println("The output from cnf is " + cnf.format(money));

  }

}

    
