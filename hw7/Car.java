package hw7;

public class Car extends Transport implements AirConsumptionAble {
    public String name;
    public double tankVolume;
    public double engineVolume;
    double fullWeight;
    double unladenWeight;

    private double avrFuelConsumption;
    private double allDistance;
    private double levelFuel;

    public Car(String name, double tankVolume, double engineVolume, double fullWeight, double unladenWeight) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.engineVolume = engineVolume;
        this.fullWeight = fullWeight;
        this.unladenWeight = unladenWeight;
        this.levelFuel = tankVolume;
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
            avrFuelConsumption = (whatAvrFuelConsumption() / (avrSpeed / optimalSpeed));
        }
        if (avrSpeed > optimalSpeed) { //If the speed is less than the optimum consumption is less
            avrFuelConsumption = (whatAvrFuelConsumption() * (avrSpeed / optimalSpeed));
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
            allDistance += possibleDistance;
        } else {
            System.out.println("You drove " + distance + " kilometers");
            System.out.println("You have " + levelFuel + " liter fuel.");
            allDistance += distance;
        }
    }

    public void iWantToDrive(double distance, double avrSpeed) {
        whatAvrFuelConsumption(avrSpeed);
        double possibleDistance = levelFuel / avrFuelConsumption;
        levelFuel = levelFuel - (distance * avrFuelConsumption);
        if (levelFuel <= 0) {
            levelFuel = 0;
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + levelFuel + " liter fuel.");
            allDistance += possibleDistance;
        } else {
            System.out.println("You drove " + distance + " kilometers, fuel consumption " + avrFuelConsumption + " L/km");
            System.out.println("You have " + levelFuel + " liter fuel.");
            allDistance += distance;
        }
    }

    public void fillTank(double liter) {
        if (liter < 0) {
            System.out.println("Non correct value");
            return;
        }
        if ((levelFuel + liter) > tankVolume) {
            System.out.println("You can fill only " + (tankVolume - levelFuel) + " liter");
        } else {
            levelFuel = levelFuel + liter;
            System.out.println("The tank is filled to " + levelFuel + " liter");
        }
    }

    public void showOdometer() {
        System.out.println("Value of odometer " + name + " " + allDistance + " kilometers");
    }

    @Override
    double carryingCapacity() {
        return 0;
    }

    @Override
    public void airConsumption() {
    }
}
