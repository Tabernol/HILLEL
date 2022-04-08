package src.HILLEL.homeWork6;

import src.HILLEL.homeWork6.Car;

public class Main {
    public static void main(String[] args) {

        src.HILLEL.homeWork6.Car bmw_x6 = new Car("BMW X6", 55, 3.6, 2500,1800);
        bmw_x6.airConsumption();
        System.out.println(bmw_x6.carryingCapacity());
    }
}
