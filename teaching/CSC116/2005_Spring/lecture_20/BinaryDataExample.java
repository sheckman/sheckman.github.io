import java.io.*;

/**
 * CSC116 Example class to demonstrate binary data IO.
 * Based on Jason Schwartz's examples
 * @author Sarah E. Smith
 * @version 1.0
 */
public class BinaryDataExample {

   /**
    * Copies the contents of input.bat to output.txt using a 
    * binary file copy.
    * @param args array of Strings from the command line
    * @throws IOException ignored in this code
    */
   public static void main(String [] args) throws IOException {
      //Opens the Files
      FileInputStream inStream = new FileInputStream("input.bat");
      FileOutputStream outStream = new FileOutputStream("output.txt");

      int next = -1;
      //Set up loop to read all of the data from input.txt
      do {
         next = inStream.read();
         if(next != -1) {
            //Converts data that is read in to a byte
            byte b = (byte) next;
            //Write to output.txt
            outStream.write(b);
         }
      } while(next != -1);
      //Closes the files
      inStream.close();
      outStream.close();
   }
}
