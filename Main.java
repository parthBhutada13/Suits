import java.util.*;

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffleDeck();
        System.out.println("Shuffled Deck:");
        deck.printDeck();
    }
}
