package tasks.cards;

import java.util.ArrayList;

class Deck {
    private ArrayList<CartFromTheDeck> Deck = new ArrayList<>();
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    private String[] suits = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    void initiateDeck() {
        for (String rank : ranks) {
            for (String suit : suits) {
                CartFromTheDeck cartFromTheDeck = new CartFromTheDeck(rank, suit);
                this.Deck.add(cartFromTheDeck);
            }
        }
    }

    void displayCards() {
        for (CartFromTheDeck cartFromTheDeck : Deck) {
            System.out.println(cartFromTheDeck);
        }
    }
}
