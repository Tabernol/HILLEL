package UDEMY.Lesson11;


public class Car {
    String color;
    String engine;
    int amountDoors;

    Car(String color, String engine, int amountDoors) {
        this.color = color;
        this.engine = engine;
        this.amountDoors = amountDoors;
    }


}

class CarTest {
    public static void carDoors(Car c, int newAmountDoors) {
        c.amountDoors = newAmountDoors;
    }

    public static void changeColor(Car avto1, Car avto2) {
        String change = avto1.color;
        avto1.color = avto2.color;
        avto2.color = change;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Red", "Gasoline", 3);
        Car c2 = new Car("Black", "Disel", 5);
        System.out.println("Before");
        System.out.println(c1.color + " " + c1.engine + " " + c1.amountDoors);
        System.out.println(c2.color + " " + c2.engine + " " + c2.amountDoors);
        System.out.println("After");
        changeColor(c1, c2);
        carDoors(c1, 4);
        System.out.println(c1.color + " " + c1.engine + " " + c1.amountDoors);
        System.out.println(c2.color + " " + c2.engine + " " + c2.amountDoors);
    }
}
