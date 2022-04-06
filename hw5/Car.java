package hw5;

public class Car {
    public String name;
    public double tankVolume;
    public double engineVolume;

    private double avrFuelConsumption;
    private double allDistance;
    private double levelFuel;

    public Car(String name, double tankVolume, double engineVolume) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.engineVolume = engineVolume;
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
            setAvrFuelConsumption(whatAvrFuelConsumption() / (avrSpeed / optimalSpeed));
        }
        if (avrSpeed > optimalSpeed) { //If the speed is less than the optimum consumption is less
            setAvrFuelConsumption(whatAvrFuelConsumption() * (avrSpeed / optimalSpeed));;
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
            setAllDistance(getAllDistance()+possibleDistance);
        } else {
            System.out.println("You drove " + distance + " kilometers");
            System.out.println("You have " + levelFuel + " liter fuel.");
            setAllDistance(getAllDistance()+distance);
        }
    }

    public void iWantToDrive(double distance, double avrSpeed) {
        whatAvrFuelConsumption(avrSpeed);
        double possibleDistance = getLevelFuel() / getAvrFuelConsumption();
        setLevelFuel(getLevelFuel()-(distance*getAvrFuelConsumption()));
        if (getLevelFuel() <= 0) {
            setLevelFuel(0);
            System.out.println("You can drive only " + possibleDistance + " kilometers");
            System.out.println("You car stop because fuel finish");
            System.out.println("You have " + getLevelFuel() + " liter fuel.");
            setAllDistance(getAllDistance()+possibleDistance);
        } else {
            System.out.println("You drove " + distance + " kilometers, fuel consumption " + getAvrFuelConsumption() + " L/km");
            System.out.println("You have " + getLevelFuel() + " liter fuel.");
            setAllDistance(getAllDistance()+distance);
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
        System.out.println("Value of odometer " + name + " " + getAllDistance() + " kilometers");
    }

    public double getAvrFuelConsumption() {
        return avrFuelConsumption;
    }

    public double getAllDistance() {
        return allDistance;
    }

    public void setAllDistance(double allDistance) {
        this.allDistance = allDistance;
    }

    public void setAvrFuelConsumption(double avrFuelConsumption) {
        this.avrFuelConsumption = avrFuelConsumption;
    }

    public double getLevelFuel() {
        return levelFuel;
    }

    public void setLevelFuel(double levelFuel) {
        this.levelFuel = levelFuel;
    }
}
