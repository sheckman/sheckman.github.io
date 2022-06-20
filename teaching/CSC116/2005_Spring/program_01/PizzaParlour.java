import java.text.NumberFormat;

/**
 * ADD JAVADOC HERE
 */
public class PizzaParlour {
	/**
 	 * ADD JAVADOC HERE
 	 */
	public void findBaseCost(int diameter) {
	}

	/**
 	 * ADD JAVADOC HERE
 	 */
	public void findToppingCost(int diameter, int toppings) {
	}

	/**
 	 * ADD JAVADOC HERE
 	 */
	public void findDeliveryCost(double miles) {
	}

	/**
 	 * ADD JAVADOC HERE
 	 */
	public void findAllCost(int diameter, int toppings, double miles) {
	}

	/**
 	 * ADD JAVADOC HERE
 	 */
	public void findProfitMargin(double cost, double price) {
	}

	/**
	 * The main method to test out the program.
	 * One test case is given.  You should at at least two more test
	 * cases below the given one.
	 * @param args command line arguments which we do not use
	 */
	public static void main(String[] args) {
		//Test case one
		PizzaParlour pizzaTheHut = new PizzaParlour();
		pizzaTheHut.findBaseCost(12);
		pizzaTheHut.findToppingCost(12,2);
		pizzaTheHut.findDeliveryCost(10.6);
		pizzaTheHut.findAllCost(12,2,10.6);
		pizzaTheHut.findProfitMargin(8.66,14.99);
	}
}
