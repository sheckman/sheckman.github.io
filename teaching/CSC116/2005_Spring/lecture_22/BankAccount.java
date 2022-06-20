/**
 * Example class which demonstrates copying, null references,
 * the this reference, constructors and method calls.
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class BankAccount {
  /**
   * Private instance variable which holds the account balance
   */
  private double balance;

  /**
   * Null constructor.  This initializes each instance variable
   * to a default value determined by the class author.
   */
  public BankAccount() {
    //Set the instance variable balance to the value of 0.00
    //by calling the method setBalance, which belongs to this object.
    this.setBalance(0.00);
  }

  /**
   * Complete constructor.  This initializes each instance variable
   * to a value provided by the user of the constructor.
   * @param initBalance the initial value to use for balance
   */ 
  public BankAccount(double initBalance) {
    //Set the instance variable balance to the value of initBalance
    //by calling the method setBalance, which belongs to this object.
    this.setBalance(initBalance);
  }

  /**
   * Sets the balance instance variable to the given double
   * value.  This performs no error checking on the value of the double.
   * @param newBalance the new value to use for balance
   */
  public void setBalance(double newBalance) {
    //Set the value of balance, which belongs to this object, to the
    //value of the parameter newBalance
    this.balance=newBalance;
  }

  /**
   * Retrieves the value of the balance variable and returns it
   * to the caller of the method as a double.
   * @return the value of balance as a double
   */
  public double getBalance() {
    //Return the value of balance, which belongs to this object.
    return this.balance;
  }

  /**
   * Main method which creates and copys some bank account objects
   * and calls methods on the objects
   * @param args Array of String from the command line
   */
  public static void main(String[] args) {
    //Create a bank account using he null constructor called emptyBank.
    //This creates a new object.
    BankAccount emptyBank = new BankAccount();

    //Create a bank account using the complete constructor called fullBank.
    //This creates a new object.
    BankAccount fullBank = new BankAccount(1000000.00);

    //Create a reference to a BankAccount that points to nothing
    //NOTE THAT THIS DOES NOT CREATE A NEW OBJECT!!!
    BankAccount zeroBank=null;

    //Point the reference zeroBank to emptyBank
    zeroBank=emptyBank;

    //Create a copy of fullBank called millionare.
    //This creates a new object by using the complete constructor.
    BankAccount millionare = new BankAccount(fullBank.getBalance());

    //Print the balances of emptyBank and zeroBank
    System.out.println("Empty bank balance: "+emptyBank.getBalance());
    System.out.println("Zero bank balance: "+zeroBank.getBalance());
    System.out.println("");

    //Change the balance of emptyBank to one dollar
    emptyBank.setBalance(1.00);

    //Print the balances of emptyBank and zeroBank
    //Note that since zeroBank and emptyBank are both references to
    //the same object changing one changed both!
    System.out.println("Empty bank balance: "+emptyBank.getBalance());
    System.out.println("Zero bank balance: "+zeroBank.getBalance());
    System.out.println("");
  }
}
