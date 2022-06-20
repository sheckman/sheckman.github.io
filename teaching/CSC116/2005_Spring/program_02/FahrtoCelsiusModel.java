/**
 *
 * Converts degrees Fahrenheit to degrees Celsius
 *
 * @author Carol Miller
 */
public class FahrtoCelsiusModel {

/**
 * Factor used to convert from fahrenheit to celsius
 */
public static final double F2C_FACTOR = 5./9.;

/**
 * Used in conversion
 */
public static final double OFFSET = 32.;

/**
 * The temperature in celsius
 */
private double answer;

 /**
  * Converts degrees F to degrees C
  *
  * @param    degrees Fahrenheit
  */ 
public void FtoC (String degrees) {

        double fahr = Double.parseDouble(degrees);
	answer      = (fahr - OFFSET) * F2C_FACTOR;
        return;
 }

/** 
 * Answers degrees Celsius
 *
 * @return degrees Celsius
 */
public String   getAnswer () {

	return  "" +  answer;
 }


/**
 * Used to test the model
 *
 * @param args command line arguments (not used)
 */
public static void main( String [] args) {
// used for 'unit' testing....
	FahrtoCelsiusModel converter = new FahrtoCelsiusModel();
        converter.FtoC ("32.");
	System.out.println( " 32 F = " + converter.getAnswer() + "C" );	

        converter.FtoC("212.");
	System.out.println (" 212 F = " + converter.getAnswer() + "C");
}
}

