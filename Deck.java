import java.util.Random;

/**
 * Class: DECK
 * 
 * This is the Deck class for our deck of cards.
 * A deck can consist of 52 or 54 cards, depending on if Jokers are included.
 * A full 52 card deck consists of 13 cards in each of 4 suits
 * 
 * @author Matt Heitzer | mheitzer44@gmail.com
 * @date 07.15.2014
 */

public class Deck {
   
   private Card[] deck; // An array to store the cards
   
   private int cardsUsed; // Keeps track of cards used
   
   /**
    * Constructor to create a standard, unshuffled 52 card deck
    */
   public Deck() {
      this(false);
   }
   
   /**
    * Constructor to create an unshuffled deck of 52 or 54 cards
    * @param includeJokers If true, a 54 card deck will be created. Otherwise, a 52 card deck is created.
    */
   public Deck(boolean includeJokers) {
      if (includeJokers)
         deck = new Card[54];
      else
         deck = new Card[52];
      
      createDeck();
      
      if (includeJokers) {
         deck[52] = new Card(0, 0); // Create a Joker
         deck[53] = new Card(0, 0); // Create a Joker
      }
      cardsUsed = 0; 
   }
   
   public void createDeck() {
	   int cardCt = 0;
	      for ( int suit = 1; suit <= 4; suit++ ) {
	         for ( int value = 1; value <= 13; value++ ) {
	            deck[cardCt] = new Card(value,suit);
	            cardCt++;
	         }
	      }
   }
   
   /**
    * Method to shuffle the deck into a random order.
    */
   public void shuffle() {
      for ( int i = deck.length-1; i > 0; i-- ) {
         int rand = (int)(Math.random()*(i+1));
         Card temp = deck[i];
         deck[i] = deck[rand];
         deck[rand] = temp;
      }
      cardsUsed = 0;
      System.out.println("Shuffling...");
   }   
   
   /**
    * Method to deal the last card in the deck.
    * @return Returns the last card in the deck
    */
   public Card dealCard() {
      if (cardsUsed == deck.length)
         throw new IllegalStateException("No cards are left in the deck.");
      cardsUsed++;
      System.out.println("Dealing a card...");
      return deck[cardsUsed - 1];
   }
   
   /**
    * Randomly chooses a card from the deck.
    * @return Returns a random card from the deck
    */
   public Card drawCard() {
	   Random rand = new Random();
	   int randomNum = rand.nextInt(deck.length);
	   return deck[randomNum];
   }
   
   /**
    * A simple magic trick that guesses a person's card
    * @param card The person's card
    * @return Returns the person's card
    */
   public Card magicTrick(Card card) {
	   System.out.println("\n\nHmm... I'm thinking...");
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException ie) {
			System.out.println(ie);
		}
	   System.out.println("Abracadabra! Here's your card: " + card.toString());
	   return card;
   }
   

   /**
    * Determines whether the deck has jokers or not
    * @return Return true if it has jokers, false otherwise.
    */
   public boolean hasJokers() {
      return (deck.length == 54);
   }
   
   /**
    * Method to view all the cards in the current deck
    * @return Returns a toString version of all the cards
    */
   public String view() {
	   String cards = "\n--------------------------------------"
			   		+ "------------------------------------------------------------------------"
			   		+ "------------------------------------------------------------------------\n";
	   for (int i = 0; i < deck.length; i++) {
		   if (i % 13 == 12) {
			   cards = cards + deck[i].toString() + " |\n--------------------------------------"
			   		+ "------------------------------------------------------------------------"
			   		+ "------------------------------------------------------------------------\n";
		   }
		   else {
			   cards = cards + deck[i].toString() + " | ";
		   }
	   }
	   System.out.println(cards);
	   return cards;
   }
}
