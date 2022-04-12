package hw5;

import hw4.Car;

public class Coupe extends Car {
    private int numberOfTurbines;

    public Coupe(String name, double tankVolume, double engineVolume, int numberOfTurbines) {
        super(name, tankVolume, engineVolume);
        this.numberOfTurbines = numberOfTurbines;
        this.setLevelFuel(tankVolume);
    }

    public void showNumberOfTurbines() {
        System.out.println("Number of turbines in the car " + numberOfTurbines);
    }
}
