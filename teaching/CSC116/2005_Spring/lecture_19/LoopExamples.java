import java.io.*;

/**
 * CSC116 Example code demonstrating while, do, and for loops
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class LoopExamples {

   /**
    * Example of a while loop that sums all integers from 1 to 
    * 100
    * Loop executes 100 times.
    */
   public void whileLoopEx() {
      int sum = 0;
      int num = 1;
      while(num <= 100) {
         sum += num;
         num++;
      }
      System.out.println("The sum of all integers from 1 to 100 is " + sum);
   }

   /**
    * Example of a do loop that prints out numbers from 10 to 1
    * Loop executes 11 times.
    */
   public void doLoopEx() {
      int num = 10;
      do {
         System.out.println(num);
         num--;
      } while(num > 0);
   }

   /**
    * Example of a for loop that prints out numbers from 1 to 10
    * incrementing through the numbers
    */
   public void forLoopEx1() {
      for(int i = 1; i <= 10; i++) {
         System.out.println(i);
      }
   }

   /**
    * Example of a for loop that prints out numbers from 10 to 1
    * decrementing through the numbers
    */
   public void forLoopEx2() {
      for(int i = 10; i > 0; i--) {
         System.out.println(i);
      }
   }
     
   /**
    * Example of a for loop that prints out even numbers from 0 to 10
    * incrementing through the numbers
    */
   public void forLoopEx3() {
      for(int i = 0; i <= 10; i += 2) {
         System.out.println(i);
      }
   } 

   /**
    * Example of a nested loop that prints out a formatted multiplication
    * table for 1 through 5
    */
   public void nestedForLoopEx1() {
      System.out.println("     1    2    3    4    5");
      int COL_WIDTH = 5;
      for(int i = 1; i <= 5; i++) {
         System.out.print(i);
         for(int j = 1; j <=5; j++) {
            int x = i * j;
            String output = "" + x;
            while(output.length() < COL_WIDTH)
               output = " " + output;
            System.out.print(output);
         }
         System.out.println();
      }
   }

   /**
    * Example of a nested loop that prints a tree of numbers from 1 to 9
    */
   public void nestedForLoopEx2() {
      for (int x = 1; x < 10; x++) { //Print line
         for (int y = 1; y <=x; y++) {
            System.out.print(y);
         }	
         System.out.println();
      }       
   }

   /**
    * Example of an infinite loop
    */
   public void infiniteLoopEx() {
      int i = 0;
      while(i < 10) {
         System.out.println(i);
      }
   }

   public static void main(String [] args) {

      LoopExamples le = new LoopExamples();

      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

      int sel = 1;
      while(sel > 0 && sel < 10) {

         System.out.println("Menu");
         System.out.println("");
         System.out.println("1 - While Loop Example");
         System.out.println("2 - Do Loop Example"); 
         System.out.println("3 - For Loop Example 1");
         System.out.println("4 - For Loop Example 2");
         System.out.println("5 - For Loop Example 3");
         System.out.println("6 - Nested For Loop Example 1");
         System.out.println("7 - Nested For Loop Example 2");
         System.out.println("8 - Infinite Loop");
         System.out.println("9 - Quit Program");

         try {
            String line = console.readLine();
            sel = Integer.parseInt(line);
         }
         catch (NumberFormatException e) {
            System.exit(0);
         }
         catch (IOException e) {
            System.exit(0);
         }

         System.out.println("");
         switch(sel) {
            case 1: le.whileLoopEx();
                    break;
            case 2: le.doLoopEx();
                    break;
            case 3: le.forLoopEx1();
                    break;
            case 4: le.forLoopEx2();
                    break;
            case 5: le.forLoopEx3();
                    break;
            case 6: le.nestedForLoopEx1();
                    break;
            case 7: le.nestedForLoopEx2();
                    break;
            case 8: le.infiniteLoopEx();
                    break;
            case 9: System.exit(0);
            default: System.exit(0);
         }
         System.out.println("");
      } 
   }
}

    
   
