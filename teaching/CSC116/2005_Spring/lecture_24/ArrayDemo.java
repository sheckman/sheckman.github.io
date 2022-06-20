/**
 * CSC116 Example Class Array Demo to Demonstrate Manipulating Arrays
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class ArrayDemo {

  /**
   * Method which displays the contents of an integer array to
   * the screen.
   * @param data the array of integers to display to the screen
   */
  public void showArray(int[] data) {
    if (data==null) {
      System.out.println("Null array!");
      return;
    }

    System.out.println("The contents of the array are:");
    for (int i=0; i < data.length; i++) {
      System.out.println("  Position "+i+" contains the value "+data[i]);
    }
    System.out.println();
  }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    //Create an ArrayDemo object
    ArrayDemo myDemo = new ArrayDemo();
    //Create two arrays
    int[] data_one = new int[10];
    int[] data_two = new int[10];

    //Populate the array data_one with value equal to the index
    for (int x=0; x < 10; x++) 
      data_one[x]=x;

    //Print out the contents of data_one
    System.out.println("The contents of data_one are:");
    myDemo.showArray(data_one);

    //Print out the contents of data_two
    System.out.println("The contents of data_two are:");
    myDemo.showArray(data_two);

    //Copy the data to data_two
    System.out.println("The contents of data_one are being copied to data_two");
    System.arraycopy(data_one,0,data_two,0,data_one.length);
    System.out.println("The contents of data_two are:");
    myDemo.showArray(data_two);
  }
}
