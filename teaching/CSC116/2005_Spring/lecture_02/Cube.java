import java.lang.Math;

/**
 * CSC116 Example Class to demonstrate variable declaration,
 * constants, arithmetic operations (including the Math library),
 * and different types of casting
 * @author Sarah E. Smith (sesmith5@ncsu.edu)
 * @version 1.0
 */
public class Cube {

   /**
    * Main method which runs the program
    * @param args array of strings from the command line
    */
   public static void main(String [] args) {

      final double pricePerCubedInch = 0.05;    //Named constant 
      final double pricePerSquareInch = 0.03;   //Named constant
      
      int sideLengthInInches = 5;    //Integer variable with initial val
      int volumePrice;               //Integer variable with no init val

      //Compute surface area of cube
      int surfaceArea = 6 * (sideLengthInInches * sideLengthInInches);
      //Compute volume of cube (Math.pow returns a double)
      double volume = Math.pow(sideLengthInInches, 3);

      System.out.println("The surface area of the cube is: " + surfaceArea);
      System.out.println("The volume of the cube is: " + volume);

      //Compile error! - Loss of precision
      //volumePrice = volume * pricePerCubedInch;
      //System.out.println("Volume Price: $" + volumePrice);

      //Explicit casting of calculation to int (comment out 2 lines above)
      volumePrice = (int)(volume * pricePerCubedInch);
      System.out.println("(Explicit Casting)Volume Price: $" + volumePrice);

      double dVolumePrice = volume * pricePerCubedInch;
      System.out.println("(No casting - expression contains all doubles)Volume Price: $" + dVolumePrice);

      //Implicit casting of surfaceArea into a double
      double saPrice = surfaceArea * pricePerSquareInch;
      System.out.println("(Implicit casting)SA price: $" + saPrice);

   }

}
