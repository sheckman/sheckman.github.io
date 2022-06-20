import java.util.*; //needed for Arrays.sort in main()

/* Card class for Poker 
 *
 * @author Carol Miller
 * @version 1.0
 */

public class Card implements Comparable {

/** The value on the card. For example: 5 */
private int    value;
/** The suit on the card. Will be C for clubs, D for diamonds,
                                  H for hearts, S for spade  */
private String suit;

/** 
 *  Answers a new Card with value and suit set to the parameters 
 *
 *  @param number a value from 1 to 13 representing the value on the card
 *  @param cdhs   "C" for clubs, "D" for diamonds, "H" for hearts, "S" for spades
 */
public Card ( int number, String cdhs) {
value = number;
suit  = cdhs  ;  //C for clubs, D for diamonds, H for hearts, S for spades
}

/** 
 *  Answers the suit for this card 
 *  @return suit
 */
public String getSuit ( ) {
return suit;
}

/** 
 *  Answers the value for this card
 *  @return value
 */
public int getValue ( ) {
return value;
}

/**
 * Answers  the value and suit
 * @return  the value and suit as a String
 */
public String toString () {

return value + " " + suit;
}
 
/**
 * Answers a value used to order two Cards
 * <  0  This card goes before the other card
 * == 0  This card equals the other card (in value and suit)
 * >  0  This card goes after the other card
 *
 * If the two cards have different values, the 
 *    value of this card minus the value of the other card is returned. Thus,
 *    a 5 H will go before 6 C
 *
 * If the two cards have the same values, the cards are ordered alphabetically, based on suit.
 *    Thus, a Club comes before a Spade (i.e. 5 C comes before 5 S)
 *
 * @param The other Card object
 * @return integer value (explained above)
 */ 
public int compareTo (Object otherCard) {


int otherValue = ( (Card) otherCard).getValue();

if ( value != otherValue) {
   return value - ((Card)otherCard).value;
}

return suit.compareTo (  ((Card)otherCard).suit);

}

public static void main(String [] args) {

Card aCard = new Card (9, "H");

System.out.println ( aCard.getValue());
System.out.println ( aCard.getSuit());

Card anotherCard = new Card (8,"H");
System.out.println ( aCard.compareTo (anotherCard));

System.out.println ( aCard.compareTo (new Card (9,"C") ));

Card [] array = new Card [3];
array[0] = new Card (2,"C");
array[1] = new Card (2,"H");
array[2] = new Card (1,"C");

// The ace (card with value 1) will be sorted as lowest value
Arrays.sort (array,0,3);
System.out.println (array[0]);
System.out.println (array[1]);
System.out.println (array[2]);
}
}
