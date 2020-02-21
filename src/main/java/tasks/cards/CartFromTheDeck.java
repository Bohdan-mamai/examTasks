package tasks.cards;

public class CartFromTheDeck {
    private String rank;
    private String suit;

    CartFromTheDeck(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return this.rank + " of " + this.suit;
    }
}
