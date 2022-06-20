import java.text.NumberFormat;

/**
 * CSC116 Example Class to Demonstrate Classes and Objects and the 
 * equals method
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 2.0
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
  public void deposit(double amt) {
    currentBalance = currentBalance + amt;
    System.out.println(amt + " was deposited to " + accountName);
  }

  /**
   * Method to withdraw money from the account.  The method is
   * public, which means it can be accessed by any object.
   */
  public void withdraw(double amt) {
    if(amt <= currentBalance) {
       currentBalance = currentBalance - amt;
       System.out.println(amt + " was withdrawn from " + accountName);
    }
    else {
       System.out.println(amt + " cannot be withdrawn from " + accountName);
    }
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
   * Returns true if the argument has the same account name
   * and current balance of the current object
   * @param a Account to compare this object o
   * @return true if the argument equals the current object
   */
  public boolean equals(Account a) {
    if(!this.accountName.equals(a.accountName))
      return false;
    if(this.currentBalance != a.currentBalance)
      return false;
    return true;
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
    alice.deposit(50.00);
    bob.withdraw(20.00);
    bob.withdraw(400.00);
 
    //Show balance of accounts
    alice.showBalance();
    bob.showBalance();

    if(alice.equals(bob)) 
      System.out.println("alice has the same contents as bob");
    else
      System.out.println("bob does not have the same contents as alice");

    Account charlie = new Account();
    charlie.accountName = "Bob456";
    charlie.currentBalance = 285.10;

    if(bob.equals(charlie))
       System.out.println("charlies has the same contents as bob");
    else
       System.out.println("charlie does not have the same contents as bob");
  
  }

}
