import java.io.*; //Import the Java I/O package 

/**
 * CSC116 Example Class to demonstrate reading more than one line of 
 * input from standard input.  Based on sample code from Jason
 * Schwartz's lecture.
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class ReadMultiInput {

   /**
    * Main method which runs the program
    * @param args array of strings from the command line
    */
   public static void main(String [] args) {
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
      boolean done = false;
      try {
         while(!done) {
            String line = console.readLine();
            if(line.equals(""))
               done = true;
            else 
               System.out.println(line);
         }
      }
      catch(IOException e) {
         System.out.println(e);
         System.exit(0);
      }
   }
}
