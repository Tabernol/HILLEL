package hw6;

public class Main {
    public static void main(String[] args) {

        Car bmw_x6 = new Car("BMW X6", 55, 3.6, 2500,1800);
        bmw_x6.airConsumption();
        System.out.println(bmw_x6.carryingCapacity());
    }
}
