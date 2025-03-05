import java.util.*;

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffleDeck();
        System.out.println("Shuffled Deck:");
        deck.printDeck();

        System.out.println("\nPrinting a specific card (Index 0):");
	deck.printCard(0);

	System.out.println("\nCards with suit 'Hearts':");
	deck.sameCard("Hearts");
	
	System.out.println("\nCards with rank 'A':");
	deck.compareCard("A");
	    
	String searchRank = "K";
	String searchSuit = "Spades";
	System.out.println("\nFinding card " + searchRank + " of " + searchSuit + ": " +
		(deck.findCard(searchRank, searchSuit) ? "Card found!" : "Card not found."));
    }
}
