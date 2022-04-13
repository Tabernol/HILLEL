package hw7;

public enum CarryingCapacity {
    B1(400),
    B(3500),
    C(7500),
    С1(20000);

    private int fullWeight;
    CarryingCapacity (int fullWeight){
        this.fullWeight = fullWeight;
    }

    public int getFullWeight(){
        return fullWeight;
    }
}
