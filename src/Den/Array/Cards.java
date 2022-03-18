package Den.Array;

public class Cards {
   private Suit suit;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public Cards(Suit suit) {
        this.suit = suit;
    }
}
