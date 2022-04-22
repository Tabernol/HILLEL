package hw7;

public enum CarryingCapacity {
    B1(400),
    B(3500),
    C(7500),
    С1(20000);

    public final int FULL_WEIGHT;
    CarryingCapacity (int fullWeight){
        this.FULL_WEIGHT = fullWeight;
    }
}
