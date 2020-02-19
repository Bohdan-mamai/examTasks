package tasks.cards;

import java.util.ArrayList;

public class Deck {
    ArrayList<CartFromTheDeck> Deck = new ArrayList<>();
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    String[] suits = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    public void initiateDeck(){
        for (String rank : ranks){
            for(String suit : suits){
                CartFromTheDeck cartFromTheDeck = new CartFromTheDeck(rank,suit);
                this.Deck.add(cartFromTheDeck);
            }
        }
    }

    public void displayCards(){
        for (CartFromTheDeck cartFromTheDeck : Deck) {
            System.out.println(cartFromTheDeck);
        }
    }
}
