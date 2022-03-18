package Den.Array;

public enum Suit {
    KING(1), ACE(2), TEN(3);
    private int rang;

    Suit(int rang) {
        this.rang = rang;
    }

    public int getRang() {
        return rang;
    }
}
