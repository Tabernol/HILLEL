package hw7;

public class Car extends Transport implements AirConsumAble {
    private String name;
    private double engineVolume;
    private int unladenWeight;
    TankVolume tankVolume;
    TypeOfEngine typeOfEngine;
    CarryingCapacity category;

    private double avrFuelConsumption;
    private double allDistance;
    private double levelFuel;

    public Car(String name, double engineVolume, int unladenWeight,
               TankVolume tankVolume, TypeOfEngine typeOfEngine, CarryingCapacity category) {
        this.name = name;
        this.engineVolume = engineVolume;
        this.unladenWeight = unladenWeight;
        this.tankVolume = tankVolume;
        this.typeOfEngine = typeOfEngine;
        this.category = category;
        this.levelFuel = tankVolume.VOLUME;
    }

    @Override
    public double carryingCapacity() {
        return category.FULL_WEIGHT - unladenWeight;
    }

    @Override
    public void airConsumption() {
        System.out.println("To obtain data on air consumption, the following data are required:" +
                " engine capacity, cylinder rollers, crankshaft speed, number of strokes," +
                " filling factor, and air density.");
    }

    private double whatAvrFuelConsumption() {
        double factorEngineVolume = 5;
        avrFuelConsumption = engineVolume * factorEngineVolume / 100;
        return avrFuelConsumption;
    }

    private void whatAvrFuelConsumption(double avrSpeed) {
        if (avrSpeed < 0 || avrSpeed > 200) {
            System.out.println("Non correct value of speed");
            return;
        }
        double optimalSpeed = 80;
        if (avrSpeed <= optimalSpeed) { //If the speed is less than the optimum consumption is higher
            setAvrFuelConsumption(whatAvrFuelConsumption() / (avrSpeed / optimalSpeed));
        }
        if (avrSpeed > optimalSpeed) { //If the speed is less than the optimum consumption is less
            setAvrFuelConsumption(whatAvrFuelConsumption() * (avrSpeed / optimalSpeed));
            ;
        }
    }

    public void iWantToDrive(double distance) {
        whatAvrFuelConsumption();
        double possibleDistance = levelFuel / avrFuelConsumption;
        levelFuel -= (distance * avrFuelConsumption);
        if (levelFuel <= 0) {
            levelFuel = 0;
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + levelFuel + " liter fuel.");
            setAllDistance(getAllDistance() + possibleDistance);
        } else {
            System.out.println("You drove " + distance + " kilometers");
            System.out.println("You have " + levelFuel + " liter fuel.");
            setAllDistance(getAllDistance() + distance);
        }
    }

    public void iWantToDrive(double distance, double avrSpeed) {
        whatAvrFuelConsumption(avrSpeed);
        double possibleDistance = getLevelFuel() / getAvrFuelConsumption();
        setLevelFuel(getLevelFuel() - (distance * getAvrFuelConsumption()));
        if (getLevelFuel() <= 0) {
            setLevelFuel(0);
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + getLevelFuel() + " liter fuel.");
            setAllDistance(getAllDistance() + possibleDistance);
        } else {
            System.out.println("You drove " + distance + " kilometers, fuel consumption " + getAvrFuelConsumption() + " L/km");
            System.out.println("You have " + getLevelFuel() + " liter fuel.");
            setAllDistance(getAllDistance() + distance);
        }
    }

    public void fillTank(double liter) {
        if (liter < 0) {
            System.out.println("Non correct value");
            return;
        }
        if ((levelFuel + liter) > tankVolume.VOLUME) {
            System.out.println("You can fill only " + (tankVolume.VOLUME - levelFuel) + " liter");
        } else {
            levelFuel += liter;
            System.out.println("The tank is filled to " + levelFuel + " liter");
        }
    }

    public void showOdometer() {
        System.out.println("Value of odometer " + name + " " + getAllDistance() + " kilometers");
    }

    public void showCoefficientPerformance() {
        System.out.println("Coefficient performance " + typeOfEngine.COEFFICIENT_OF_PERFORMANCE + "%");
    }

    private double getAvrFuelConsumption() {
        return avrFuelConsumption;
    }

    private double getAllDistance() {
        return allDistance;
    }

    private void setAllDistance(double allDistance) {
        this.allDistance = allDistance;
    }

    private void setAvrFuelConsumption(double avrFuelConsumption) {
        this.avrFuelConsumption = avrFuelConsumption;
    }

    private double getLevelFuel() {
        return levelFuel;
    }

    private void setLevelFuel(double levelFuel) {
        this.levelFuel = levelFuel;
    }
}
