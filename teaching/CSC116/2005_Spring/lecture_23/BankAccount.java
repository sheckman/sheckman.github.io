/**
 * CSC116 Example Class BankAccount to Demonstrate Static Variables
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class BankAccount {
  /**
   * The account balance
   */
  private double balance;

  /**
   * The unique account number for the account
   */
  private int accountNumber;

  /**
   * The last account number assigned to any account
   */
  private static int lastAssignedNumber=0; 

  /**
   * Constructor which assigns a unique account number and
   * updates the value of lastAssignedNumber to a reflect
   * the new account number.
   * @param starting the initial balance of the account
   */
  public BankAccount (double starting) {
    balance = starting;
    lastAssignedNumber++;
    accountNumber = lastAssignedNumber;
  }

  /** 
   * Retrieve the unique account number for the BankAccount
   * @return int containing the unique account number
   */
  public int getAccountNumber() {
    return this.accountNumber;
  }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    //Create one account
    BankAccount firstAccount = new BankAccount(50.00);
    System.out.println("The first account created received account number "+
      firstAccount.getAccountNumber());

    //Create another account
    BankAccount secondAccount = new BankAccount(100.00);
    System.out.println("The second account created received account number "+
      secondAccount.getAccountNumber());
  }
}

