package hw7;

public enum TankVolume {
    SMALL(35),
    MEDIUM(57),
    LARGE(92),
    HUGE(380);

    public final double VOLUME;
    TankVolume(double volume) {
        this.VOLUME = volume;
    }
}
