import java.io.*;

/**
 * CSC116 Example class to demonstrate reading and 
 * writing multiple lines from a file
 * Based on Jason Schwartz's code
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class TextDataLinesExample {

   /**
    * Copies contents of input.txt to output.txt by 
    * copying each line of input.txt
    * @param args array of Strings from the command line
    * @throws IOException ignored in this program  
    */
   public static void main(String [] args) throws IOException {
   
      FileReader reader = new FileReader("input.txt");
      FileWriter writer = new FileWriter("output.txt");
    
      BufferedReader in = new BufferedReader(reader);
      PrintWriter out = new PrintWriter(writer);

      String line = null;
     
      do {
         line = in.readLine();
         if(line != null) {
            out.println(line);
         }
      } while (line != null);
   
      in.close();
      out.close();
      reader.close();
      writer.close();
   }
}

