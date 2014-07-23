/**
 * Class: CARD
 * 
 * This is the Card class for our Deck of Cards. 
 * 
 * Each card has two distinct features: VALUE and SUIT.
 * VALUE is one of the following: Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
 * SUIT is one of the following: Spades, Hearts, Diamonds, Clubs, or a Joker
 */

public class Card {

   private static String[] suits = { "", "hearts", "spades", "diamonds", "clubs" };
   private static String[] values  = {"Joker", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
   
   private final int suit; //The card's suit
   private final int value; // The card's value
   
   /**
    * Constructor to create any card in the deck
    * @param theValue The value of the card
    * @param theSuit The suit of the card
    */
   public Card(int theValue, int theSuit) {
      value = theValue;
      suit = theSuit;
   }

   /**
    * Gets the suit of a card
    * @return Returns the suit
    */
   public int getSuit() {
      return suit;
   }
   
   /**
    * Gets the value of a card
    * @return Returns the value
    */
   public int getValue() {
      return value;
   }
   
   /**
    * Returns the toString version of the Card (i.e. "10-diamonds," "ACE-spades")
    * @return Returns a string version of the Card
    */
   public String toString() {
	   return values[value] + "-" + suits[suit];
   }
}
