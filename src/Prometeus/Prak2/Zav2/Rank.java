package Prometeus.Prak2.Zav2;

import java.util.Objects;

public class Rank {
    public static final Rank ACE = new Rank("Ace", 0);
    public static final Rank KING = new Rank("King", 1);
    public static final Rank QUEEN = new Rank("Queen", 2);
    public static final Rank JACK = new Rank("Jack", 3);
    public static final Rank TEN = new Rank("10", 4);
    public static final Rank NINE = new Rank("9", 5);
    public static final Rank EIGHT = new Rank("8", 6);
    public static final Rank SEVEN = new Rank("7", 7);
    public static final Rank SIX = new Rank("6", 8);

    public static Rank[] values = {ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX};

    private String name;
    private int ranck;

    Rank(String name, int ranck) {
        this.name = name;
        this.ranck = ranck;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank = (Rank) o;
        return Objects.equals(name, rank.name);
    }

    public int getRanck() {
        return ranck;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return
                name;
    }
}
