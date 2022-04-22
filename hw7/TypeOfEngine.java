package hw7;

public enum TypeOfEngine {
    DIESEL(33),
    GASOLINE(25),
    HYBRID(40),
    ELECTRIC(90);

    public final int COEFFICIENT_OF_PERFORMANCE;
    private TypeOfEngine(int coefficientPerformance){
        this.COEFFICIENT_OF_PERFORMANCE = coefficientPerformance;
    }
}
