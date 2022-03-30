package src.HILLEL.hw4;

public class Car {
    private String name;
    private double tankVolume;
    private double engineVolume;

    private double avrFuelConsumption;   //this is encapsulated data
    private double allDistance;          //this is encapsulated data
    private double levelFuel;            //this is encapsulated data

    public Car() {
        System.out.println("Use constructor with parameter, because you create very bad car - Lada");
        this.name = "Lada";
        this.tankVolume = 39;
        this.engineVolume = 1.3;
        this.levelFuel = tankVolume/2;
        System.out.println("You tank is fill half");
    }

    public Car(String name, double tankVolume, double engineVolume) {
        if (name.length() > 20) {
            System.out.println("Non correct the name must be less than 20 characters");
            return;
        }
        this.name = name;
        if (tankVolume > 100 || tankVolume < 10) {
            System.out.println("Non correct value of volume tank");
            return;
        }
        this.tankVolume = tankVolume;
        if (engineVolume > 5 || engineVolume < 0.5) {
            System.out.println("Non correct value of engine volume");
            return;
        }
        this.engineVolume = engineVolume;
        this.levelFuel = tankVolume;
        System.out.println("You tank is full");
    }

    //method that calculates and returns the value of the average fuel consumption in liter/kilometer
    private double whatAvrFuelConsumption() {
        double factorEngineVolume = 5;
        if (name.equalsIgnoreCase("Lada")) {
            factorEngineVolume = 10;
        }
        avrFuelConsumption = engineVolume * factorEngineVolume / 100;
        return avrFuelConsumption;
    }

    //method that calculates and returns the value of the average fuel consumption
    // in liter/kilometer depending on the average speed
    private void whatAvrFuelConsumption(double avrSpeed) {
        if (avrSpeed < 0 || avrSpeed > 200) {
            System.out.println("Non correct value of speed");
            return;
        }
        double optimalSpeed = 80;
        if (avrSpeed <= optimalSpeed) { //If the speed is less than the optimum consumption is higher
            avrFuelConsumption = whatAvrFuelConsumption() / (avrSpeed / optimalSpeed);
        }
        if (avrSpeed > optimalSpeed) { //If the speed is less than the optimum consumption is less
            avrFuelConsumption = whatAvrFuelConsumption() * (avrSpeed / optimalSpeed);
        }
    }

    //The method calculates the ability to travel a given distance depending on the fullness of the tank.
    //shows information
    public void iWantToDrive(double distance) {
        whatAvrFuelConsumption();
        double possibleDistance = levelFuel / avrFuelConsumption;
        levelFuel -= (distance * avrFuelConsumption);
        if (levelFuel <= 0) {
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + (levelFuel = 0) + " liter fuel.");
            allDistance += possibleDistance;
        } else {
            System.out.println("You drove " + distance + " kilometers, fuel consumption " + avrFuelConsumption + " L/km");
            System.out.println("You have " + levelFuel + " liter fuel.");
            allDistance += distance;
        }

    }

    //The method calculates the ability to travel a given distance
    // and a given average speed depending on the fullness of the tank.
    //shows information
    public void iWantToDrive(double distance, double avrSpeed) {
        whatAvrFuelConsumption(avrSpeed);
        double possibleDistance = levelFuel / avrFuelConsumption;
        levelFuel = levelFuel - (distance * avrFuelConsumption);
        if (levelFuel <= 0) {
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + (levelFuel = 0) + " liter fuel.");
            allDistance += possibleDistance;
        } else {
            System.out.println("You drove " + distance + " kilometers, fuel consumption " + avrFuelConsumption + " L/km");
            System.out.println("You have " + levelFuel + " liter fuel.");
            allDistance += distance;
        }
    }

    //The method fills the tank, does not allow to fill more volume
    public void fillTank(double liter) {
        if (liter < 0) {
            System.out.println("Non correct value");
            return;
        }
        if ((levelFuel + liter) >= tankVolume) {
            System.out.println("You can fill only " + (tankVolume - levelFuel) + " liter");
        } else {
            levelFuel = levelFuel + liter;
            System.out.println("The tank is filled to " + levelFuel + " liter");
        }
    }

    //The method shows the total mileage of the car
    public void showOdometer() {
        System.out.println("Value of odometer " + name + " " + allDistance + " kilometers");
    }
}
