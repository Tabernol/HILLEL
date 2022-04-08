package HILLEL;

import hw5.Car;
import hw5.Coupe;
import hw5.Limousine;

public class Main {
    public static void main(String[] args) {

        hw6.Car c = new hw6.Car("BMW X6", 55, 3.6, 2500,1800);
        c.airConsumption();
        System.out.println(c.carryingCapacity());
    }
}
