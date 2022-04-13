package hw7;

public enum TankVolume {
    SMALL(35),
    MEDIUM(57),
    LARGE(92),
    HUGE(380);

    private double volume;
    TankVolume(double volume) {
        this.volume = volume;
    }

    public double getTankVolume(){
        return volume;
    }
}
