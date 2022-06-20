/**
 * CSC116 Example program that demonstrates if statements
 * boolean math, and switch statements
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Grader {

   /**
    * Shows the letter grade for a given numerical score. Uses
    * the boolean AND operator.  
    * @param score the numerical score
    */
   public void showTestScoreBooleanMath(int score) {
      if(score <= 100 && score >= 90)
         System.out.println("A");
      if(score < 90 && score >= 80)
         System.out.println("B");
      if(score < 80 && score >= 70)
         System.out.println("C");
      if(score < 70 && score >= 60)
         System.out.println("D");
      if(score < 60)
         System.out.println("FAIL - no one should do this!");
   }

   /**
    * Shows is a letter grade is passing or failing.  Uses 
    * the boolean OR operator
    * @param lg the string letter grade
    */
   public void passOrFail(String lg) {
      if(lg.equals("A") || lg.equals("B") || lg.equals("C")) {
         System.out.println("PASS");
      }
      if(lg.equals("D") || lg.equals("F")) {
         System.out.println("FAIL");
      }
   }

   /**
    * Shows if a letter grade is failing.  Uses the boolean
    * NOT operator
    * @param grade the string letter grade
    * @return true if the grade is failing
    */
   public boolean failClass(String grade) {
      if(!grade.equals("F")) 
         return false;
      return true;
   }


   /**
    * Shows the letter grade for a given numerical score. uses
    * multiple if statements  
    * @param score the numerical score
    */
   public void showTestScoreMultipleIfs(int score) {
      if(score >= 90)
         System.out.println("A");
      else if(score >= 80)
         System.out.println("B");
      else if(score >= 70)
         System.out.println("C");
      else if(score >= 60)
         System.out.println("D");
      else 
         System.out.println("FAIL - no one should do this!");
   }


   /**
    * Shows the letter grade for a given numerical score. Uses
    * Nested if statements
    * @param score the numerical score
    */
   public void showTestScoreNestedIfs(int score) {
      if(score >= 60) {
         if(score >= 70) { 
            if(score >= 80) {
               if(score >= 90)
                  System.out.println("A");
               else
                  System.out.println("B");
            }
            else 
               System.out.println("C");
         }
         else
            System.out.println("D");
      }
      else {
         System.out.println("FAIL - no one should do this!");
      }
   }

   /**
    * Shows the text for a given digit.  Uses switch statements
    * @param digit to convert to text
    */
   public void showDigit(int digit) {
      switch (digit) {
         case 1: System.out.println("one");
            break;
         case 2: System.out.println("two");
            break;
         case 3: System.out.println("three");
            break;
         default: System.out.println("unknown");
            break;
      }
   }

   /**
    * Converts a grade to a plus/minus score
    * @param score the numerical score
    */
   public void showPlusMinusScore(int score) {
      switch (score) {
         case 100:
         case 99:
         case 98: System.out.println("A+");
            break;
         case 97:
         case 96:	
         case 95:	
         case 94:		
         case 93: System.out.println("A");
            break;
         default: System.out.println("unknown");
            break;
      }
   }

   /**
    * The main method for the Grader program.  Starts
    * the program
    * @param args String array of command line input
    */
   public static void main(String [] args) {
      Grader g = new Grader();
      
      int score1 = 98;
      int score2 = 93;
      int score3 = 85;
      int score4 = 75;
      int score5 = 60;
      int score6 = 25;

      g.showTestScoreBooleanMath(score1);
      g.showTestScoreBooleanMath(score2);
      g.showTestScoreBooleanMath(score3);
      g.showTestScoreBooleanMath(score4);
      g.showTestScoreBooleanMath(score5);
      g.showTestScoreBooleanMath(score6);

      System.out.println("");

      g.showTestScoreMultipleIfs(score1);
      g.showTestScoreMultipleIfs(score2);
      g.showTestScoreMultipleIfs(score3);
      g.showTestScoreMultipleIfs(score4);
      g.showTestScoreMultipleIfs(score5);
      g.showTestScoreMultipleIfs(score6);

      System.out.println("");

      g.showTestScoreNestedIfs(score1);
      g.showTestScoreNestedIfs(score2);
      g.showTestScoreNestedIfs(score3);
      g.showTestScoreNestedIfs(score4);
      g.showTestScoreNestedIfs(score5);
      g.showTestScoreNestedIfs(score6);

      System.out.println("");

      g.showDigit(1);
      g.showDigit(2);
      g.showDigit(3);
      g.showDigit(4);
 
      System.out.println("");

      g.showPlusMinusScore(score1);
      g.showPlusMinusScore(score2);
      g.showPlusMinusScore(score3);   

      System.out.println("");

      g.passOrFail("A");
      g.passOrFail("D");

      System.out.println("");

      System.out.println(g.failClass("A"));
      System.out.println(g.failClass("F"));
   }
}  
