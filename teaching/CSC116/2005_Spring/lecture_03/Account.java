import java.text.NumberFormat;

/**
 * CSC116 Example Class to Demonstrate Classes and Objects
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Account {

  /**
   * Instance variable to store the current balance of the 
   * account as a double.  The value is public, which means it
   * can be accessed by any object.
   */
  public double currentBalance;

  /**
   * Instance variable to store the account name as a String.
   * The value is public, which means it can be accessed by any
   * object.
   */
  public String accountName;

  /**
   * Method to deposit money into the account.  The method is
   * public, which means it can be accessed by any object.
   */
  public void deposit() {
    currentBalance = currentBalance + 100.0;
    System.out.println("$100.00 was deposited to " + accountName);
  }

  /**
   * Method to withdraw money from the account.  The method is
   * public, which means it can be accessed by any object.
   */
  public void withdraw() {
    currentBalance = currentBalance - 50.00;
    System.out.println("$50.00 was withdrawn from " + accountName);
  }

  /**
   * Method to show current balance.  The method is public,
   * which means it can be accessed by any object.
   */
  public void showBalance() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    System.out.println("The current balance of " + accountName + " is " + nf.format(currentBalance));
  }

  /**
   * Main method which runs the program
   * @param args array of strings from the command line
   */
  public static void main(String [] args) {
    //Create accounts
    Account alice = new Account();
    Account bob = new Account();

    //Modify Alice's account
    alice.accountName = "Alice123";
    alice.currentBalance = 500.00;

    //Modify Bob's account
    bob.accountName = "Bob456";
    bob.currentBalance = 305.10;

    //Show balance of accounts
    alice.showBalance();
    bob.showBalance();

    //Deposit money
    alice.deposit();
    bob.withdraw();
 
    //Show balance of accounts
    alice.showBalance();
    bob.showBalance();
  
  }

}