import java.io.*;

/**
 * CSC116 Example Class TryDemo to Demonstrate Throwing and Catching 
Exceptions
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class TryDemo {
  /**
   * Method to read the first line from a file and print it to the
   * screen.  The method will generate an EOFException if the file
   * exists but is empty, or will pass along any other IOExceptions
   * to the calling method.
   * @throws IOException if any IO error occurs
   */
  public void pLine () throws IOException {
    BufferedReader in = new BufferedReader
      (new FileReader("input.txt"));
    String inputLine = in.readLine();
    in.close();
    if (inputLine == null) {
      EOFException exception = new EOFException
        ("EOF when reading line");
      throw exception;
    }
    System.out.println(inputLine);
  }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main(String[] args) {
    TryDemo trydemo = new TryDemo();
    try {
      trydemo.pLine(); 
    }
    catch (IOException e) {
      System.out.println("An error occured: "+e);
    }
    finally {
      System.out.println("Done!");
    }
  }
}
