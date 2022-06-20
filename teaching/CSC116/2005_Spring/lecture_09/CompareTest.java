/**
 * CSC116 Example Class to Demonstrate Comparing Objects and Primitives
 * Selection Operator method added by sesmith5 2/7/2005
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 2.0
 */
public class CompareTest {
  /** 
   * Method to demonstrate comparing two int values
   * @param j the first int to be compared
   * @param k the second int to be compared
   */
  public void compareInt(int j, int k) {
    //j is less than k
    if (j<k) {
       System.out.println(j+" is less than "+k);
    } else { //j is not less than k
      // is j greater than k
      if (j>k) {
        System.out.println(j+" is greater than "+k);
      } else { //j is not greater than k either
        System.out.println(j+" is equal to "+k);
      } //Done with the else for (j>k)
    } //Done with the else for (j<k)
  }
 
  /**
   * Method to demonstrate using the selection operators
   * Added by sesmith5 2/7/2005
   * @param x the number to check if >= 0
   */
  public void selectionOperator(int x) {
    int y = x >= 0 ? x : -x;
    System.out.println("The value of y is " + y);
  }

  /**
   * Method to demonstrate comparing two objects
   * @param j the first object to be compared
   * @param k the second object to be compared
   */
  public void compareObjects(Object j, Object k) {
    if (j==k) 
      System.out.println("Both references point to the same object");
    if (j.equals(k))
      System.out.println("Both objects have the same contents");
  }

  /**
   * Method to demonstrate comparing two Strings
   * @param j the first string to be compared
   * @param k the second string to be compared
   */
  public void orderStrings(String j, String k) {
    if (j.compareTo(k) < 0)
      System.out.println(j+" comes before "+k+" in the dictionary");
    if (j.compareTo(k) > 0)
      System.out.println(k+" comes before "+j+" in the dictionary");
    if (j.compareTo(k) == 0)
      System.out.println(j+" and "+k+" are the same value in the dictionary");
   }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    //Create a CompareTest object to do the comparisons
    CompareTest myTest = new CompareTest();

    //Create two integers and compare them
    int firstInt = 6;
    int secondInt = 8;
    myTest.compareInt(firstInt,secondInt);    
    myTest.compareInt(secondInt,firstInt);
    myTest.compareInt(firstInt,firstInt);
    myTest.compareInt(secondInt,secondInt);
    
    System.out.println("");

    //Test selection operator - added by sesmith5 2/7/2005
    int positive = 6;
    int negative = -7;
    myTest.selectionOperator(positive);
    myTest.selectionOperator(negative);

    //Create two Rectangle objects and three rectangle references
    java.awt.Rectangle cerealBox=new java.awt.Rectangle(5,10,20,30);
    java.awt.Rectangle oatmealBox=new java.awt.Rectangle(5,10,20,30);
    java.awt.Rectangle crispyStuff=cerealBox;

    //Compare all of the combinations
    System.out.println("\nComparing cerealBox to oatmealBox");
    myTest.compareObjects(cerealBox,oatmealBox);
    System.out.println("\nComparing cerealBox to crispyStuff");
    myTest.compareObjects(cerealBox,crispyStuff);
    System.out.println("\nComparing oatmealBox to crispyStuff");
    myTest.compareObjects(oatmealBox,crispyStuff);
    
    //Compare the two Strings "first" and "second"
    System.out.println("");
    myTest.orderStrings("first","second");

    //Compare the two Strings "zoo" and "animal"
    System.out.println("");
    myTest.orderStrings("zoo","animal");
  
    //Compare the two Strings "foot" and "foot"
    System.out.println("");
    myTest.orderStrings("foot","foot");
  }
}
