/**
 * CSC116 Example Class to demonstrate the flow of execution in Java
 * programs, with an emphasis on variable scope.
 * This program is based on examples from the course textbook
 * "An Introduction to Object-Oriented Programming with Java" by C. 
 * Thomas Wu.  This is only part of his code from a larger example
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class ExecutionFlowExample {

   /**
    * Instance variable to contain the exchange rate
    */
   private double exchangeRate = 136.75;
   /**
    * Instance variable to contain the fee rate
    */
   private double feeRate = 12.5185;

   /**
    * Method to convert a dollar value into another value based on
    * the exchange rate of the currency
    * @param dollar the amt in dollars to convert
    * @return the amt of money in the new currency
    */
   public double fromDollar(double dollar) {
      System.out.println("After dollar created and initilized. Before amt and fee are created");
      double amt, fee;
      System.out.println("amt and fee are created an initilized to 0.0");
      fee = exchangeRate - feeRate;
      System.out.println("fee takes the value: " + fee);
      amt = dollar * fee;
      System.out.println("amt takes the value:  " + amt + " and the method will return the amount");
      return amt;
   }
 
   /**
    * Method to show that changes to values that are passed in as
    * parameters do not affect the values of the variables that 
    * were used to call the method
    * @param one value of one integer
    * @param two value of another double
    */
   public void myMethod(int one, double two) {
      System.out.println("one = " + one + " two = " + two);
      one = 25;
      two = 35.4;
      System.out.println("one = " + one + " two = " + two + " Method ends and returns to calling line");  
   }

   /**
    * Main method which runs the program
    * @param args array of strings from the command line
    */
   public static void main(String [] args) {
      ExecutionFlowExample ex = new ExecutionFlowExample();
      System.out.println("Before method");
      double amt = ex.fromDollar(200);
      System.out.println("After method - method variables no longer exist.  amt = " + amt);
      
      System.out.println("Before method");
      int x = 10;
      int y = 20;
      ex.myMethod(x, y);
      System.out.println("After method - method variables no longer exist.  x = " + x + " y = " + y);
   }
}
