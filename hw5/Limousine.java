package src.HILLEL.hw5;

public class Limousine extends Car {
    private int bottleChampagne;

    public Limousine(String name, double tankVolume, double engineVolume, int bottleChampagne) {
        super(name, tankVolume, engineVolume);
        this.bottleChampagne = bottleChampagne;
        this.setLevelFuel(tankVolume);
    }

    public void showBottleChampagne() {
        System.out.println("In this car " + bottleChampagne + " bottle champagne");
    }

}
