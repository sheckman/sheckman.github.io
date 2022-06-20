import java.io.*;

/**
 * CSC116 Example Class LineDemo to Demonstrate Line by Line IO.
 * This example includes full error checking instead of just ignoring
 * the errors as in previous IO examples.
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class LineDemo {
  /**
   * Copies the contents of the file input.txt to output.txt
   * using a line at a time text file copy.  This version of 
   * the example handles exceptions.
   * @param args Command line arguments as an array of String 
   */ 
  public static void main(String[] args) { 
    //Declare the variables prior to the exception handling
    FileReader reader = null;
    BufferedReader in = null;
    FileWriter writer = null;
    PrintWriter out = null; 

    //Open the files and copy the contents while watching for errors
    try {
      //Open the two files
      reader = new FileReader("input.txt");
      in = new BufferedReader(reader);
      writer = new FileWriter("output.txt");
      out = new PrintWriter(writer);
   
      //Setup a loop 
      String inputLine = null;
      do {
        //Read a line
        inputLine=in.readLine();

        //If the string is valid
        if (inputLine!=null) {
          out.println(inputLine);
        }
      } while (inputLine!=null); 
    }

    //Warn the user if an error occurs
    catch (IOException copyError) {
      System.out.println("Input/output error: "+copyError);
    }

    //Error or not we should try to close the files
    finally {
      //Might cause an exception itself
      try {
        //Close the files if they are open
        if (in!=null)
          in.close();
        if (out!=null)
        out.close();
      }
      catch (IOException closeError) {
        System.out.println("Error while closing file: "+closeError);
      }
    }
  }
}
