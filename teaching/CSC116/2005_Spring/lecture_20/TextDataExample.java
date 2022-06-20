import java.io.*;

/**
 * CSC116 Example class to demonstrate File IO for
 * text data including Strings and chars
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class TextDataExample {

   /**
    * Copies the contents of the file input.txt to output.txt
    * using a character at a time text file copy.  Also demonstrates
    * how to write a line of text.
    * @param args array of Strings from the command line
    * @throws IOException ignored at this time
    */
   public static void main(String [] args) throws IOException {

      FileReader reader = new FileReader("input.txt");
      FileWriter writer = new FileWriter("output.txt");

      int next = -1;
      do {
         next = reader.read();
     
         if(next != -1) {
            char c = (char) next;
            writer.write(c);
         }
      }while(next != -1);
 
      reader.close();

      writer.write("\nThis is a String to be written");
      writer.close();
   }
}
 

