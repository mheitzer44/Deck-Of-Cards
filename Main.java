/**
 * A DECK OF CARDS
 * 
 * This is the main class for my deck of cards implementation.
 * This is where I can create and use a deck of cards.
 * 
 * A deck of cards is made up of 52 or 54 cards, depending if Jokers are included or not.
 * A deck can be shuffled, dealt, and/or viewed in order.
 * 
 * @author Matt Heitzer | mheitzer44@gmail.com
 * @date 07.23.2014
 *
 */

public class Main {

	/**
	 * This main method will create and display a new deck of cards, 
	 * then shuffle the deck three times, and display the shuffled deck.
	 * 
	 * Finally, it will pick a random card, display the card and the card's characteristics.
	 * You can also uncomment the final line to see a magic trick!
	 * 
	 * @param args Input arguments
	 */
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.view();
		
		deck.shuffle(); // Shuffle the deck
		deck.shuffle(); // Shuffle the deck
		deck.shuffle(); // Shuffle the deck
		
		deck.view();
		
		Card randomCard = deck.drawCard();
		System.out.println("You randomly picked: " + randomCard.toString());
	
		//deck.magicTrick(randomCard);
	}
}
