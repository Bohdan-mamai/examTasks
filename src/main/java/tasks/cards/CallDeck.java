package tasks.cards;

public class CallDeck {
    public void displayFullDeck() {
        Deck deck = new Deck();
        deck.initiateDeck();
        deck.displayCards();
    }
}
