/**
 * CSC116 Example Class ArrayTable which Demonstrates Two Dimensional Arrays
 * @author Jason Schwarz (Jason_Schwarz@ncsu.edu)
 * @version 1.0
 */
public class ArrayTable {

  /**
   * Output information about a table to the screen
   * @param table the two dimensional array to display
   */
  public static void showInfo (int[][] table) {
    System.out.println("The number of rows is "+table.length);
    System.out.println("The number of columns is "+table[0].length);
  }

  /**
   * Output a the table to the screen
   * @param table the two dimensional array to display
   */
  public static void showTable (int[][] table) {
    final int COLUMN_WIDTH=10;

    for (int x = 0; x < table.length; x++) { 
      for (int y = 0; y < table[x].length ; y++) {
        String pstr = "" + table[x][y];
        while (pstr.length() < COLUMN_WIDTH)
          pstr = " " +pstr;
        System.out.print(pstr);
      }
      System.out.println();
    }
  }

  /**
   * Main method which runs the program
   * @param args Array of String from the command line 
   */
  public static void main (String[] args) {
    //Create a 10x8 power table
    int [][] powers = new int [10][8];
    for (int i=0; i < powers.length; i++) 
     for (int j=0; j < powers[i].length; j++)
       powers[i][j] = (int)Math.pow(i+1,j+1);
     ArrayTable.showInfo(powers);
     ArrayTable.showTable(powers);
  }
}
