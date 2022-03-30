package src.HILLEL;

import src.HILLEL.hw4.Car;

public class Main {
    public static void main(String[] args) {
        Car accord = new Car("accord", 58, 2.4);
        accord.iWantToDrive(100);
        accord.iWantToDrive(150, 130);
        accord.fillTank(15);
        accord.showOdometer();
    }
}
