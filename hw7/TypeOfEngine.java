package hw7;

public enum TypeOfEngine {
    DIESEL(33),
    GASOLINE(25),
    HYBRID(40),
    ELECTRIC(90);

    private int coefficientPerformance;
    private TypeOfEngine(int coefficientPerformance){
        this.coefficientPerformance = coefficientPerformance;
    }

    public int getCoefficientPerformance (){
        return coefficientPerformance;
    }
}
