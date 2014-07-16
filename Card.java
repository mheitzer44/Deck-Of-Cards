
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
   
   // Variables for our suits (including a JOKER)
   public final static int SPADES = 0;
   public final static int HEARTS = 1;
   public final static int DIAMONDS = 2;
   public final static int CLUBS = 3;
   public final static int JOKER = 4;

   // Numerical values for the ACE, JACK, QUEEN, and KING
   public final static int ACE = 1;
   public final static int JACK = 11;     
   public final static int QUEEN = 12;   
   public final static int KING = 13;
   
   private final int suit; //The card's suit
   private final int value; // The card's value
   
   /**
    * Constructor to create a Joker.
    */
   public Card() {
      suit = JOKER;
      value = 0;
   }
   
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
    * Returns the toString version of suit
    * @return Returns a string version of the suit
    */
   public String getSuitAsString() {
      switch ( suit ) {
      case SPADES:   return "spades";
      case HEARTS:   return "hearts";
      case DIAMONDS: return "diamonds";
      case CLUBS:    return "clubs";
      default:       return "JOKER";
      }
   }
   
   /**
    * Returns the toString version of value
    * @return Returns a string version of the value
    */
   public String getValueAsString() {
      if (suit == JOKER)
         return "JOKER";
      else {
         switch ( value ) {
         case 1:   return "ACE";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "JACK";
         case 12:  return "QUEEN";
         default:  return "KING";
         }
      }
   }
   
   /**
    * Returns the toString version of the Card (i.e. "10-Diamonds," "ACE-Spades")
    * @return Returns a string version of the Card
    */
   public String toString() {
      if (suit == JOKER) {
    	  return "JOKER";
      }
      else
    	 return getValueAsString() + "-" + getSuitAsString();
   }
}
