import java.util.StringTokenizer; //Import StringTokenizer class
import java.io.*; //Imports the Java I/O package

/**
 * CSC116 Example Class to demonstrate the use of the StringTokenizer
 * class and methods.  This example is based on code from Jason 
 * Schwartz's lectue
 * @author Sarah E. Smith
 * @version 1.0
 */
public class StringTokenizerExample {
  
   /**
    * Main method which runs the program
    * @param args array of strings from the command line
    */
   public static void main(String [] args) {

      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
      String line = "";
      try {
         line = console.readLine();
      }
      catch(IOException e) {
         System.out.println(e);
         System.exit(0);
      }
      System.out.println("First StringTokenizer");
      StringTokenizer tokenizer = new StringTokenizer(line);
      int numTokens = tokenizer.countTokens();
      for(int i = 0; i < numTokens; i++) {
         String token = tokenizer.nextToken();
         System.out.println(token);
      }
      System.out.println("\nSecond StringTokenizer");
      StringTokenizer tokenizer2 = new StringTokenizer(line, "a B");
      numTokens = tokenizer2.countTokens();
      for(int i = 0; i < numTokens; i++) {
         String token = tokenizer2.nextToken();
         System.out.println(token);
      }
   }
}
