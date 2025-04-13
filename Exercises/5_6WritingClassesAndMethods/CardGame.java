package week5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    public static void main(String[] args) {
        // Create a new deck
        Deck deck = new Deck();

        // Shuffle the deck
        deck.shuffle();

        // Deal and display five cards
        System.out.println("Dealing five random cards:");
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            System.out.println(card);
        }
    }
}

class Card {
    private String suit;
    private String rank;

    // Constructor to initialize the card's suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Getter for rank
    public String getRank() {
        return rank;
    }

    // Override toString method to display card as "Rank of Suit"
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;

    // Constructor to initialize the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create 52 cards and add them to the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to deal one card from the deck
    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No more cards left in the deck.");
        }
        return cards.remove(0); // Remove and return the top card
    }
}
