package src.HILLEL.homeWork6;

import hw6.Consumption;

public class Human implements Consumption {
    @Override
    public void airConsumption() {
        System.out.println("The average air consumption for a person " +
                "is from 0.5 to 1 cubic meter per hour");
    }
}
