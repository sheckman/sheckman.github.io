/**
 * CSC 116 Example class that demonstrates common
 * array manipulations
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class ArrayManipulations {

   private static int [] unsorted = {2,5,3,7,1,5,9,0,0,0};
   private static int [] sorted = {2,3,5,7,8,9,11,0,0,0};
   private static int unsortedCounter = 7;
   private static int sortedCounter = 7;

   /**
    * Returns the position in an array of a given value,  and 
    * -1 if the value is not in the array
    * @param a array of integers
    * @param value to find
    * @return location of value or -1
    */
   public int findValue(int [] a, int value) {		
      int location = -1;
      for(int x = 0; x < a.length; x++) {
         if(a[x] == value) {
            location = x;
            return location;
         }
      }
      return location;
   }

   /**
    * Returns the number of times a value occurs in an array
    * @param a array of ints
    * @param value to count
    * @return number of times value in array
    */
   public int countOccur(int [] a, int value) {
      int count = 0;
      for(int x = 0; x < a.length; x++) {
         if(a [x] == value) {
            count++;
         }
      }
      return count;
   }

   /**
    * Returns true if the value was inserted into an unsorted array
    * @param value to insert
    * @return true if inserted
    */
   public boolean insertUnsorted(int value) {
       boolean ret = false;
       if(unsortedCounter < unsorted.length) {
          unsorted[unsortedCounter] = value;
          unsortedCounter++;
          ret = true;
       }
       return ret;
   }

   /**
    * Returns true if the value was inserted into a sorted array
    * @param value to insert
    * @return true if inserted
    */
   public boolean insertSorted(int value) {
       boolean ret = false;
       if(sortedCounter < sorted.length) {
           int position = 0;
           for(int x = 0; x < sortedCounter; x++) {
             if(sorted[x] < value) {
                position = x + 1; // you want to add one b/c
                                  // value will be added after
                                  // the position
             }
           }
           //move elements up one starting with last element
           for(int y = sortedCounter; y > position; y--) {
             sorted[y] = sorted[y-1];
           }
           sorted[position] = value;
           sortedCounter++;
           ret = true;
       }
     
       return ret;
   }

   /**
    * Returns true if the first instance of a value was deleted
    * from an unsorted array
    * @param value to delete
    * @return true if deleted
    */
   public boolean deleteUnsorted(int value) {
      int location = findValue(unsorted,value);
      boolean ret = false;
      if(location != -1) {
         unsorted[location] = unsorted[unsortedCounter - 1];
         unsortedCounter--;
         ret = true;
      }
      return ret;
   }

   /**
    * Returns true if the first instance of a value was deleted    
    * from a sorted array
    * @param value to delete
    * @return true if deleted 
    */
   public boolean deleteSorted(int value) {
      int location = findValue(sorted,value);
      boolean ret = false;
      if(location != -1) {         
         for(int x = location; x <= sortedCounter; x++) { 
            sorted[x] = sorted[x + 1];
         }  
         sortedCounter--;
         ret = true;
      }
      return ret;
   }
         
   /**
    * Main method of the ArrayManipulation class, starts the program
    * @param args array of comman line arguments
    */
   public static void main(String [] args) {

      ArrayManipulations am = new ArrayManipulations();
   
      int [] a = {1,2,3,4,5,2,3,4,5};
      int val1 = am.findValue(a,1);
      int val2 = am.findValue(a,3);
      System.out.println("Va1 1 = " + val1 + " Val 2 = " + val2);

      int count1 = am.countOccur(a, 2);
      int count2 = am.countOccur(a, 5);
      System.out.println("Count 1 = " + count1 + " Count 2 = " + count2);

      boolean insert = am.insertUnsorted(6);
      System.out.println("Value inserted? " + insert);
      for(int x = 0; x < unsortedCounter; x++) {
         System.out.println("Position " + x + " = " + unsorted[x]);
      }

      insert = am.insertSorted(4);
      System.out.println("Value inserted? " + insert);
      for(int x = 0; x < sortedCounter; x++) {
         System.out.println("Position " + x + " = " + sorted[x]);
      }

      boolean delete = am.deleteUnsorted(5);
      System.out.println("Value deleted? " + delete);
      for(int x = 0; x < unsortedCounter; x++) {
         System.out.println("Position " + x + " = " + unsorted[x]);
      }

      delete = am.deleteSorted(8);          
      System.out.println("Value deleted? " + delete);
      for(int x = 0; x < sortedCounter; x++) {         
         System.out.println("Position " + x + " = " + sorted[x]);
      }


   }
}

